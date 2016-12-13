/*
 * APC Magazine Issue 421 - Learn to Code Java Masterclass
 * Overtake.java - Overtake driving game
 * Darren Yates 28-August-2015 Version 1.0 apcmag.com
 */
package overtake;

import java.awt.*;
import java.awt.event.*;
import static java.lang.String.format;
import javax.swing.*;

public class Overtake extends JFrame {

    Car car;                                                                                // variable of type Car
    SlowCar slowCar;                                                                        // variable of type SlowCar
    CarOnComing bigTruck;                                                                   // variable of type CarOnComing
    int[] keyControls = {0,0,0,0};  // left, right, fire                                    // keyboard key control array
    Timer timer;                                                                            // initialise timer
    double timeRem;                                                                         // initialise time remaining var
    double gameLength = 4800;                                                               // set game length - 4800/40 = 120secs
    int penaltyTime = 120;                                                                  // penalty time - 3secs
    int gameEnd = 0;                                                                        // gaem end flag
    
    public static void main(String[] args) {
        new Overtake();                                                                     // launch me a new instance of this class
    }
    
    public Overtake() {
        Road road = new Road();                                                             // create a new instance of Road class
        car = new Car();                                                                    // create new instance of Car
        slowCar = new SlowCar();                                                            // create new instance of SlowCar
        bigTruck = new CarOnComing();                                                       // create new instance of CarOnComing
        add(road, BorderLayout.CENTER);                                                     // add Road JPanel to JFrame
        setSize(600,720);                                                                   // set JFrame size to 600x720-pixels
        setTitle("Overtake - APC Magazine - Learn to Code");                                // Tell 'em who we are!
        setLocationRelativeTo(null);                                                        // centre the app on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                     // assume when app close, user wants to quit
        setResizable(false);                                                                // lock down frame size
        setVisible(true);                                                                   // show the frame! floor it!!!
        initialiseApp();                                                                    // set up initial settings    
        
        class KeyChecker implements KeyListener {                                           // create KeyListener class
            @Override
            public void keyPressed(KeyEvent e) {                                            // check for key press...
                if (e.getKeyCode() == KeyEvent.VK_LEFT) { keyControls[0] = 1; }             // check for left-arrow...    
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) { keyControls[1] = 1; }            // check for right-arrow...
                if (e.getKeyCode() == KeyEvent.VK_UP) { keyControls[2] = 1; }               // check for up-arrow...
                if (e.getKeyCode() == KeyEvent.VK_DOWN) { keyControls[3] = 1; }             // check for down-arrow...
                if (e.getKeyCode() == KeyEvent.VK_Y) { initialiseApp(); }                   // check for Y key
                if (e.getKeyCode() == KeyEvent.VK_N) { System.exit(0); }                    // check for N key
            } 

            @Override
            public void keyReleased(KeyEvent e) {                                           // check for key-release (set key array to zero)
                if (e.getKeyCode() == KeyEvent.VK_LEFT) { keyControls[0] = 0; }             // left key
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) { keyControls[1] = 0; }            // right key
                if (e.getKeyCode() == KeyEvent.VK_UP) { keyControls[2] = 0; }               // up key
                if (e.getKeyCode() == KeyEvent.VK_DOWN) { keyControls[3] = 0; }             // down key
            }

            @Override
            public void keyTyped(KeyEvent e) {                                              // don't use this but have to implement it anyway...
            }
        }
        KeyChecker keyListener = new KeyChecker();                                          // create new KeyChecker object...
        addKeyListener(keyListener);                                                        // add the new object to game object
    }
           
    class Road extends JPanel {
    
        Image carDriver;                                                                    // get all the game assets from the app folder
        ImageIcon pngDriver = new ImageIcon(this.getClass().getResource("carb75.png"));
        Image carSlow;
        ImageIcon pngSlow = new ImageIcon(this.getClass().getResource("slow75.png"));
        Image truck;
        ImageIcon pngTruck = new ImageIcon(this.getClass().getResource("truck90.png"));
        Image bg;
        ImageIcon jpgBg = new ImageIcon(this.getClass().getResource("bg2.jpg"));
        Image explode;
        ImageIcon pngEx = new ImageIcon(this.getClass().getResource("explode.png"));
        Image goAgain;
        ImageIcon jpgGo = new ImageIcon(this.getClass().getResource("go.jpg"));

        public Road() {                                                                     // constructor for the Road class
            setDoubleBuffered(true);                                                        // set doublebuffering to true (smoother output)
            TimerListener animate = new TimerListener();                                    // create TimerListerner object
            timer = new Timer(25,animate);                                                  // set timer to run the 'animate' method
            timer.start();                                                                  // start the timer!!!
        }

        private class TimerListener implements ActionListener {                             // create TimerListener class *** engine room for the app!!!
        @Override
            public void actionPerformed(ActionEvent e) {                                    // when the timer fires, run this code...
                if (timeRem > 0) timeRem--;                                                 // if timerRem is still > 0, count down
                if (car.hit > 0) {                                                          // if car has hit something, run penalty 3secs
                    penaltyTime--;      
                    if (penaltyTime == 0) {                                                 // if penalty time has passed, reset cars
                        car.hit = 0;
                        penaltyTime = 100;
                        slowCar.y = -200;
                        slowCar.setSpeed();
                        bigTruck.setSpeed();
                        bigTruck.y = -bigTruck.yStart;
                        car.x = 195;
                    }
                }
                if (timeRem > 0 && car.hit == 0) {                                          // if time still remains & nothing hit... 
                    car.move(getHeight());                                                  // move car        
                    slowCar.move(getHeight());                                              // move slowCar    
                    bigTruck.move(getHeight());                                             // move bigTruck    
                    car.checkHit();                                                         // check to see if we've hit anything
                } else if (timeRem <= 0) {                                                  // BUT, if time remaining is zero...
                    gameEnd = 1;                                                            // game has finished (set flag to 1)
                }
                repaint();                                                                  // repaint the screen to show new positions
            }
        }
            
        @Override                                                                           // THIS IS THE BIT THAT DOES ALL THE DRAWING!
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            carDriver = pngDriver.getImage();
            carSlow = pngSlow.getImage();
            truck = pngTruck.getImage();
            bg = jpgBg.getImage();
            explode = pngEx.getImage();
            goAgain = jpgGo.getImage();
            g.drawImage(bg,0,0,getWidth()+1,getHeight(),this);  
            g.drawImage(carDriver, car.x, car.y, this);
            g.drawImage(carSlow, slowCar.x, (int) Math.round(slowCar.y), this);
            g.drawImage(truck, bigTruck.x ,bigTruck.y, this);
            if (car.hit == 1) g.drawImage(explode, car.x ,car.y-20, this);
            if (car.hit == 2) g.drawImage(explode, car.x ,car.y+130, this);
            if (gameEnd == 1) {
                g.drawImage(goAgain, 157,250, this);
                g.setColor(Color.WHITE);                                                        // set forecolour to white    
                g.setFont(new Font("Arial",Font.BOLD,26));                                      // set font to Consolas
                g.drawString("Your score: " + format("%.0f",car.score), 190, 335);
            }
            
            g.setColor(Color.BLACK);                                                            // set the setColor parameter to black
            g.fillRect(5,5,130,50);                                                             // create filled rectangle top-left
            g.fillRect(getWidth()-125,5,120,50);                                                // created filled rectangle top-right
            g.setColor(Color.WHITE);                                                            // set forecolour to white    
            g.setFont(new Font("Consolas",Font.BOLD,16));                                       // set font to Consolas
            g.drawString(" GEAR : "+car.gear, 10, 45 );                                         // display gear number
            g.drawString(" SPEED: " + format("%.0f",car.speed), 10, 25);                        // display car speed
            g.drawString(" SCORE: "+ format("%.0f",car.score), getWidth()-125, 25 );            // display score    
            g.drawString(" TIME : " + format("%.0f",timeRem/40), getWidth()-125, 45);           // display game time remaining
            // comment these lines out to remove extra data                                     // the following is debug info to show you how it works!
            g.drawString("Slow car in line", 10, 150 );                        
            g.drawString(" SPEED : " + format("%.2f",slowCar.speed), 10, 175);
            g.drawString(" Y-POS : " + format("%.2f",slowCar.y), 10, 200);
            g.drawString("On-coming truck", getWidth()-145, 150 );                        
            g.drawString(" SPEED : " + format("%.2f",bigTruck.speed), getWidth()-145, 175);
            g.drawString(" Y-POS : " + bigTruck.y, getWidth()-145, 200);
            // comment these lines out to remove extra data
        }

    }
    
    class Car {                                                                                 // Car class
        int gear = 1;                                                                           // class attributes
        double accel = 0;
        int x;
        int y = 0;
        double speed = 0;
        double score = 0;
        int hit = 0;
                
        public Car() {}                                                                         // no-args constructor
        
        public void move(int height) {                                                          // Move method - increments position
            if (speed > 0) {
                if (x < 330 && keyControls[1] == 1) x+=4;
                if (x > 195 && keyControls[0] == 1) x-=4;
            }
            gearCheck();                                                                        // this bit sets the car's speed
            speed+=accel;                                                                       // used to set relative position against other cars
            if (speed > 100) speed = 100;                                                       // maximum speed is 100
            if (speed < 0) speed = 0;                                                           // can't reverse!
            score += (speed/100);                                                               // score is based on speed!!!
            y = height-200;
        }
        
        public void gearCheck() {                                                               // simple implementation of a 4-speed auto gearbox
            if (gear == 1 && speed > 20) gear = 2;                                              // acceleration is based on gear selected            
            if (gear == 2 && speed > 40) gear = 3;                                              // gears change based on current car speed
            if (gear == 3 && speed > 70) gear = 4;
            if (gear == 4 && speed < 60) gear = 3;
            if (gear == 3 && speed < 40) gear = 2;
            if (gear == 2 && speed < 20) gear = 1;
            if (keyControls[2] == 1) accel = (5 - (gear/2.0))/2.0;                              // this is the acceleration equation, based on gear selection
            if (keyControls[3] == 1)  accel = (-(5-gear));                                      // braking has a separate equation    
            if (keyControls[2] == 0 && keyControls[3] == 0) accel = -0.05;                      // drag coefficient if car allowed to coast... :)
        }

        public void checkHit() {                                                                // 'did we prang a Ferrari 458' method
            if (x < slowCar.x + 65) {                                                           // did we hit the slowCar...
                if (y > slowCar.y + 140 || y < slowCar.y - 150) hit = 0; 
                else {
                    if (y < slowCar.y + 45) hit = 2; 
                    else hit = 1;
                    speed = 0;
                    slowCar.speed = 0;
                }
            }
            if (x +65 > bigTruck.x) {                                                           // or have we hit the on-coming truck????
                if (y > bigTruck.y + 190 || y < bigTruck.y - 170) hit = 0; 
                else {
                    hit = 1;
                    speed = 0;
                    bigTruck.speed = 0;
                }
            }
        }
    }
    
    class SlowCar {                                                                             // SlowCar class
        int brake;                                                                              // class attributes    
        int x = 195;
        double y;
        double speed;
        double yStart = 200;
        
        public SlowCar() {                                                                      // SlowCar constructor
            setSpeed();
            this.y = -yStart;
        }
        
        public void move(int height) {                                                          // Move method
            // movement vector addition
            y += (car.speed - speed)/20.0;                                                      // *** Change the 20 to 5 and see how unplayable it is!
            // movement vector addition
            if (y >= height + yStart) {
                y = -yStart;
                setSpeed();
            }
            if (y < -yStart) {
                y = height + yStart;
                setSpeed();
            }
        }
        
        public void setSpeed() {                                                                // Randomised slowCar speed setting
            speed = 20 + Math.random() * 20;
        }
    }
    
    class CarOnComing {                                                                         // CarOnComing class
        int x = 325;                                                                            // class attributes
        int y = 0;
        double speed;
        int yStart = 300;

        public CarOnComing() {                                                                  // class constructor
            setSpeed();
            this.y = -300;
        }

        public void move(int height) {                                                          // Move method
            // movement vector addition
            y += (car.speed + speed)/20.0;                                                      // Again, set this to 5.0 and see how it goes.
            // movement vector addition
            
            if (y > (height + yStart)) {
                y = -yStart - (int)(Math.random()*(yStart/2));                                  // set random start position
                setSpeed();
            }
            if (y < -yStart) {
                y = height + yStart;
                setSpeed();
            }
        }

        public void setSpeed() {                                                                // set randomised start speed
            speed = 60 + (Math.random()*20.0);
            y = -yStart;
        }
    }
    
    public void initialiseApp() {                                                               // initialise the app settings      
        timeRem = gameLength;                                                                   // there is bound to be something I've missed...
        car.x = 195;                                                                            // ...but feel free to tinker with the code!!! :)    
        penaltyTime = 100;
        slowCar.yStart = 200;
        bigTruck.yStart = 300;
        slowCar.y = slowCar.yStart;
        bigTruck.y = bigTruck.yStart;
        gameEnd = 0;
        car.score = 0;
        car.speed = 0;
    }
}