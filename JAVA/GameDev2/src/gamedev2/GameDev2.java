/* 
APC Magazine Issue 420 - Learn to Code Java Masterclass
GameDev2.Java class - basic game development demo
Darren Yates 18-July-2015 Version 1.0 apcmag.com
*/
package gamedev2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class GameDev2 extends JFrame {
    static final int iwidth = 140;
    static final int iheight = 120;
    ArrayList<Bandit> bandits = new ArrayList<>();                                          // arraylist for bandits
    ArrayList<FighterBullet> fighterBullets = new ArrayList<>();                            // arraylist for fighter bullets    
    Fighter fighter;                                                                        // fighter object    
    int[] keyControls = {0,0,0};  // left, right, fire                                      // keyboard key control array
    Timer timer;                                                                            // initialise timer
    int numberOfBandits;                                                                    // initialise bandit counter
    int speed = 20;                                                                         // initialise frame speed in milliseconds (supposedly) - lower is faster
    
    public static void main(String[] args) {
        new GameDev2();                                                                     // create new GameDev2 instance of type JFrame
    }
    
    public GameDev2() {
        setSize(1024,768);                                                                  // set frame size to 1024x768
        setTitle("GameDev2 - APC Magazine Learn to Code Masterclass");                      // set title
        setLayout(new BorderLayout());                                                      // set frame layout to Border type
        Map map = new Map();                                                                // create new Map object called 'map'
        add(map, BorderLayout.CENTER);                                                      // add map to GameDev2 frame, use center option
        fighter = new Fighter(getWidth()/2 - iwidth/2, getHeight() - (int)(iheight*1.6));   // place fighter near bottom of frame using width/height
        initialiseApp(0);                                                                   // run initiliseApp method with parameter 0
        
        class FighterChecker implements KeyListener {                                       // create KeyListener class
            @Override
            public void keyPressed(KeyEvent e) {                                            // check for key press...
                if (e.getKeyCode() == KeyEvent.VK_LEFT) { keyControls[0] = 1; }             // check for left-arrow...    
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) { keyControls[1] = 1; }            // check for right-arrow...
                if (e.getKeyCode() == KeyEvent.VK_CONTROL) { keyControls[2] = 1; }          // check for control key (rapid fire!)
                if (e.getKeyCode() == KeyEvent.VK_Y) { initialiseApp(1); }                  // check for 'y' upon game over    
                if (e.getKeyCode() == KeyEvent.VK_N) { System.exit(0);}                     // check for 'n' on game over (quit)
            } 

            @Override
            public void keyReleased(KeyEvent e) {                                           // check for key-release (set key array to zero)
                if (e.getKeyCode() == KeyEvent.VK_LEFT) { keyControls[0] = 0; }             // left key
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) { keyControls[1] = 0; }            // right key
                if (e.getKeyCode() == KeyEvent.VK_CONTROL) { keyControls[2] = 0; }          // contro key
            }

            @Override
            public void keyTyped(KeyEvent e) {                                              // don't use this but have to implement it anyway...
            }
        }
        FighterChecker fighterListener = new FighterChecker();                              // create new FighterChecker object...
        addKeyListener(fighterListener);                                                    // add the new object to game object
        setLocationRelativeTo(null);                                                        // centre the app on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                     // assume when app close, user wants to quit
        setVisible(true);                                                                   // show the frame! tally-ho!!!
    }
  
    class Map extends JPanel {                                                              // create JPanel class called map
        Image spit;                                                                         // grab all of the image resources from the source package...
        ImageIcon pngSpit = new ImageIcon(this.getClass().getResource("spit88.png"));
        Image cloud;
        ImageIcon jpgCloud = new ImageIcon(this.getClass().getResource("cloud.jpg"));
        Image spitAmmo;
        ImageIcon pngBullet = new ImageIcon(this.getClass().getResource("spitbullet.png"));
        Image me888;
        ImageIcon pngMe888 = new ImageIcon(this.getClass().getResource("me888.png"));
        Image explode;
        ImageIcon pngExplode = new ImageIcon(this.getClass().getResource("explode.png"));
        Image gexplode;
        ImageIcon pnggExplode = new ImageIcon(this.getClass().getResource("gerexplode.png"));
        Image gameOver;
        ImageIcon pngGO = new ImageIcon(this.getClass().getResource("pngGameOver.png"));
        Image noAmmo;
        ImageIcon pngNoAmmo = new ImageIcon(this.getClass().getResource("noammo.png"));

        public Map() {                                                                      // constructor for the Map class
            setDoubleBuffered(true);                                                        // set doublebuffering to true (smoother output)
            TimerListener animate = new TimerListener();                                    // create TimerListerner object
            timer = new Timer(speed,animate);                                               // set timer to run the 'animate' method
            timer.start();                                                                  // start the timer!!!
        }
        
        private class TimerListener implements ActionListener {                             // create TimerListener class *** engine room for the app!!!
            @Override
            public void actionPerformed(ActionEvent e) {                                    // when the timer fires, run this code...
                fighter.move(getWidth(),getHeight());                                       // update the fighter position
                Iterator<Bandit> iBandit = bandits.iterator();                              // create iterator for Bandit array
                while (iBandit.hasNext()) {                                                 // while we're still moving through the array...
                    Bandit bandit = iBandit.next();                                         // get the next bandit
                    bandit.move(getWidth(),getHeight());                                    // move the bandit as required
                    if (bandit.shotdown == 1 && bandit.explodeCount == 0) iBandit.remove(); // has the bandit been hit or finished crashing, run the Bandit.remove method
                }
                
                if (keyControls[2] == 1 && fighter.bullets > 0) {                           // if Ctrl key is down and still have bullets...
                    fighterBullets.add(new FighterBullet(fighter.x, fighter.y));            // FIRE!!!!!!
                    fighter.bullets--;                                                      // decrement the bullets parameter    
                }
                
                Iterator<FighterBullet> nextBullet = fighterBullets.iterator();             // create iterator for the bullet arrayu
                while (nextBullet.hasNext()) {                                              // while we're moving through the array...
                    FighterBullet newBullet = nextBullet.next();                            // get the next bullet
                    newBullet.move(getWidth(), getHeight());                                // move the bullet to the correct position
                    if (newBullet.hit == 1 || newBullet.y < 0) nextBullet.remove();         // if the bullet hits something or off-screen, remove it from array
                }
                repaint();                                                                  // update the display with new game positions...
            }
        }

        @Override                                                                           // THIS IS THE BIT THAT DOES ALL THE DRAWING!
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            gameOver = pngGO.getImage();                                                    // create all the images used for the game from the Icon objects
            cloud = jpgCloud.getImage();
            g.drawImage(cloud,0,0,getWidth(),getHeight(),this);                             // draw the cloud background (courtesy of paint.net :)
            spit = pngSpit.getImage();
            me888 = pngMe888.getImage();
            spitAmmo = pngBullet.getImage();
            explode = pngExplode.getImage();
            gexplode = pnggExplode.getImage();
            noAmmo = pngNoAmmo.getImage();
            
            if ( fighter.bullets == 0 ) {                                                   // if there are no more buwwets left...
                if (fighter.explodeCount > 0) {                                             // and the fighter hasn't started or finished exploding...
                    fighter.explode();                                                      // set the fireball animation on the fighter
                    int xoffset = fighter.baseWidth/4 + (int)(Math.random()*10);                // this code is for randomising the fireball image
                    int yoffset = (int)(fighter.baseHeight*0.45)+ (int)(Math.random()*10)-5 ;   // to create 'flicker'
                    int xsize = 40 + (int)(Math.random()*30);
                    int ysize = 40 + (int)(Math.random()*30);
                    g.drawImage(explode, fighter.x+xoffset, fighter.y + yoffset, xsize, ysize, this);
                } else {                                                                    // if the fireball count is now zero (had enough flicker now)...
                    timer.stop();                                                           // stop the timer
                    fighter.lives--;                                                        // decrement the 'lives' counter    
                    if (fighter.lives >= 0) initialiseApp(0);                               // and if at least one life remaining, restart the app with parameter 0.
                }
            }

            for (Bandit bandit : bandits) {                                                 // create a for-each style look for the bandits
                if (bandit.shotdown == 1) {                                                 // if this bandit has been hit...        
                    if (bandit.explodeCount > 0) {                                          // start the explode timer counter
                        bandit.explode();                                                   // set the bandit on fire...
                        int xoffset = bandit.baseWidth/4 + (int)(Math.random()*10);             // make the fireball flicker...
                        int yoffset = (int)(bandit.baseHeight*0.15)+ (int)(Math.random()*10)-5 ;
                        int xsize = 40 + (int)(Math.random()*30);
                        int ysize = 40 + (int)(Math.random()*30);
                        g.drawImage(gexplode, bandit.x+xoffset, bandit.y + yoffset, xsize, ysize, this);
                    }
                }
                g.drawImage(me888, bandit.x, bandit.y, bandit.baseWidth,bandit.baseHeight, this);   // draw the enemy fighter in its position.
            }
            if (bandits.isEmpty()){                                                         // if all enemy fighters shot down (jolly good show!)...
                fighter.level++;                                                            // start a new level...
                fighter.score+=fighter.bullets;                                             // add remaining bullets to score.            
                initialiseApp(0);                                                           // restart the app with parameter 0
            }

            if (fighter.explodeCount > 0) g.drawImage(spit, fighter.x, fighter.y, this);    // provided the fighter is still alive, show it on screen.
            
            for (FighterBullet fighterBullet : fighterBullets) {                            // create loop for the current array of buwwets
                g.drawImage(spitAmmo, fighterBullet.x, fighterBullet.y, this);              // draw the buwwets...
            }
            g.setColor(Color.BLACK);                                                        // set the setColor parameter to black
            g.fillRect(5,getHeight()-55,130,50);                                            // create filled rectangle bottom-left
            g.fillRect(getWidth()-125,getHeight()-55,120,50);                               // created filled rectangel bottom-right
            g.setColor(Color.WHITE);                                                        // set forecolour to white    
            g.setFont(new Font("Consolas",Font.BOLD,16));                                   // set font to Consolas
            g.drawString(" SCORE: "+fighter.score, 10, getHeight()-15 );                    // display score    
            g.drawString(" LEVEL: "+fighter.level, 10, getHeight()-35 );                    // display level
            g.drawString(" AMMO : " + (fighter.bullets), getWidth()-120, getHeight()-15);   // display ammo level
            g.drawString(" LIVES: " + (fighter.lives), getWidth()-120, getHeight()-35);     // display number of lives remaining
            if (fighter.explodeCount == 0 & fighter.lives < 0)                              // if game over...
                g.drawImage(gameOver,getWidth()/2-pngGO.getIconWidth()/2,getHeight()/2-pngGO.getIconHeight()/2,this);
            if (fighter.bullets == 0 && fighter.lives > 0)                                  // if no more buwwets but lives remaining...    
                g.drawImage(noAmmo, getWidth()/2-pngNoAmmo.getIconWidth()/2,getHeight()/2-pngNoAmmo.getIconHeight()/2, this);
        }
    }

    class Fighter {                                                                         // Java class for Fighter
        int x;                                                                              // current x-coord
        int y;                                                                              // current y-coord
        int dx = 3;                                                                         // movement speed of fighter per frame (20ms)        
        int baseWidth = 150;                                                                // base width of fighter box
        int baseHeight = 120;                                                               // base height of fighter box/frame
        int score = 0;                                                                      // score
        int bullets;                                                                        // bullets    
        int shotdown = 0;                                                                   // has it been shotdown (for upgrade)
        int level = 1;                                                                      // game level
        int lives = 3;                                                                      // number of lives
        int explodeCount = 50;                                                              // explode frame count, reaches 0: plane removed
        
        public Fighter() {}                                                                 // no-args constructor
        
        public Fighter(int x, int y) {                                                      // constructor with x and y positioning paramters
            this.x = x;
            this.y = y;
        }

        public void explode() {                                                             // explode method
            this.explodeCount--;
        }

        public void move(int width, int height) {                                           // move method
            if (x + baseWidth <= width && x >= 0 ) {
                if (keyControls[0] == 1) x -= dx;
                if (keyControls[1] == 1) x += dx;
            }
            else if (x + baseWidth > width) x = width - baseWidth;
            else if (x < 0) x = 0;
            y = height - (int)(baseHeight*1.2);
        }
    }
    
    class Bandit {                                                                          // Class for enemy fighters
        int x;
        int y;
        int dx = (int)(Math.random()*6)-3;
        int dy = (int)(Math.random()*6)-3;
        int baseWidth = 142;
        int baseHeight = 135;
        int shotdown = 0;
        int explodeCount = 50;
        
        public Bandit() {}                                                                  // no-args constructor

        public Bandit(int x, int y) {                                                       // constructor with x and y position parameters
            this.x = x;
            this.y = y;
            if (dx == 0) dx = 1;
            if (dy == 0) dy = 1;
        }
        
        public void move(int width, int height) {                                           // move method
            if (x + iwidth < width && x > 0 ) x += dx;
            else { dx = -dx; x += dx; }
            if (x + baseWidth >= fighter.x && x <= fighter.x + fighter.baseWidth && y + iheight >= fighter.y && 
                    y + iheight <= fighter.y + fighter.baseHeight && dy > 0 )
                {dy = -dy; y+= dy; }
            if (y + iheight < (height*0.9) && y > 0) y += dy;
            else { dy = -dy; y += dy; }
        }
        
        public void explode() {                                                             // explode method          
            explodeCount--;
        }
    }  
    
    class FighterBullet {                                                                   // Class for fighter bullets
        int x;
        int y;
        int dy = 10;
        int hit = 0;
        
        public FighterBullet() {}                                                           // no-args constructor      
        
        public FighterBullet (int x, int y) {                                               // constructor with x and y position parameters    
            this.x = x + (iwidth/2)-3;
            this.y = y - 4;
        }
        
        public void move (int width, int height) {                                          // move method        
            this.y -= dy;
            hitAnything (width, height);
        }
        
        public void hitAnything (int width, int height) {                                   // hitAnything method
            for (Bandit bandit : bandits) {
                if (y < (bandit.y + (2*bandit.baseHeight/3)) && y > bandit.y && x > bandit.x + (bandit.baseWidth/3) && x < bandit.x + ((2*bandit.baseWidth)/3) && bandit.shotdown == 0) {
                    bandit.shotdown = 1;
                    fighter.score++;
                    this.hit = 1;
                    break;
                }
            }
        }
    }
    
    public void initialiseApp(int mode) {                                                   // app initialisation/restart method       
        numberOfBandits = 20;                                                               // change this to change the number of bandits
        fighter.shotdown = 0;
        fighter.explodeCount = 50;
        bandits.clear();
        fighterBullets.clear();
        if (mode == 1) {
            fighter.score = 0;
            fighter.level = 0;
            fighter.lives = 3;
        }
        for (int index = 0; index < numberOfBandits; index++) {
            bandits.add( new Bandit ((int)((getWidth()/((numberOfBandits*1.3)) * index))+4, (int)(Math.random() * (getHeight()/2-iheight)) ));
        }
        fighter.bullets = (int)(3*numberOfBandits);                                         // number of bullets = 3 x number of fighters you set...           
        timer.start();                                                                      // star the timer and get cracking!!!         
    }
}