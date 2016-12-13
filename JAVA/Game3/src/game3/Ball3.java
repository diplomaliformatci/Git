package game3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Ball3 {

    Random r = new Random();
    private static final int DIAMETER = 40;
    int x = 960;
    int y = 850;
    int xa = 2;
    int ya = 2;
    public static int score = 0;
    private Game3 game;

    public Ball3(Game3 game) {

        this.game = game;
    }

    void move() {
        if (x + xa < 0) {
            xa = 2;
        }
        if (x + xa > game.getWidth() - DIAMETER) {
            xa = -2;
        }
        if (y + ya < 0) {
            ya = 2;
        }
        if (y + ya > game.getHeight() - DIAMETER) {

            game.gameOver();
        }
        if (collision()) {
            ya = -2;
            y = game.racquet.getTopY() - DIAMETER;

        }
        if (collision2()) {

            if (y + ya < game.block1.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block1.sayac1 >= 0) {
                    score++;
                    game.block1.sayac1--;
                }

            } else if (y + ya > game.block1.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block1.sayac1 >= 0) {
                    score++;
                    game.block1.sayac1--;
                }
            } else if (x + xa < game.block1.getLeftX() - DIAMETER) {
                xa = -2;
                if (game.block1.sayac1 >= 0) {
                    score++;
                    game.block1.sayac1--;
                }
            } else if (x + xa > game.block1.getRightX() - DIAMETER) {
                xa = 2;
                if (game.block1.sayac1 >= 0) {
                    score++;
                    game.block1.sayac1--;
                }
            }

        }

        if (collision3()) {

            if (y + ya < game.block2.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block2.sayac2 >= 0) {
                    score++;
                    game.block2.sayac2--;
                }

            } else if (y + ya > game.block2.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block2.sayac2 >= 0) {
                    score++;
                    game.block2.sayac2--;
                }
            } else if (x + xa < game.block2.getLeftX() - DIAMETER) {
                xa = -2;
                if (game.block2.sayac2 >= 0) {
                    score++;
                    game.block2.sayac2--;
                }
            } else if (x + xa > game.block2.getRightX() - DIAMETER) {
                xa = 2;
                if (game.block2.sayac2 >= 0) {
                    score++;
                    game.block2.sayac2--;
                }
            }

        }

        if (collision4()) {

            if (y + ya < game.block3.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block3.sayac3 >= 0) {
                    score++;
                    game.block3.sayac3--;
                }

            } else if (y + ya > game.block3.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block3.sayac3 >= 0) {
                    score++;
                    game.block3.sayac3--;
                }
            } else if (x + xa < game.block3.getLeftX() - DIAMETER) {
                xa = -2;
                if (game.block3.sayac3 >= 0) {
                    score++;
                    game.block3.sayac3--;
                }
            } else if (x + xa > game.block3.getRightX() - DIAMETER) {
                xa = 2;
                if (game.block3.sayac3 >= 0) {
                    score++;
                    game.block3.sayac3--;
                }
            }

        }
        if (collision5()) {

            if (y + ya < game.block4.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block4.sayac4 >= 0) {
                    score++;
                    game.block4.sayac4--;
                }

            } else if (y + ya > game.block4.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block4.sayac4 >= 0) {
                    score++;
                    game.block4.sayac4--;
                }
            } else if (x + xa < game.block4.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block4.sayac4 >= 0) {
                    score++;
                    game.block4.sayac4--;
                }
            } else if (x + xa > game.block4.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block4.sayac4 >= 0) {
                    score++;
                    game.block4.sayac4--;
                }
            }

        }
        if (collision6()) {

            if (y + ya < game.block5.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block5.sayac5 >= 0) {
                    score++;
                    game.block5.sayac5--;
                }

            } else if (y + ya > game.block5.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block5.sayac5 >= 0) {
                    score++;
                    game.block5.sayac5--;
                }
            } else if (x + xa < game.block5.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block5.sayac5 >= 0) {
                    score++;
                    game.block5.sayac5--;
                }
            } else if (x + xa > game.block5.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block5.sayac5 >= 0) {
                    score++;
                    game.block5.sayac5--;
                }
            }

        }
        if (collision7()) {

            if (y + ya < game.block6.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block6.sayac6 >= 0) {
                    score++;
                    game.block6.sayac6--;
                }

            } else if (y + ya > game.block6.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block6.sayac6 >= -1) {
                    score++;
                    game.block6.sayac6--;
                }
            } else if (x + xa < game.block6.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block6.sayac6 >= 0) {
                    score++;
                    game.block6.sayac6--;
                }
            } else if (x + xa > game.block6.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block6.sayac6 >= 0) {
                    score++;
                    game.block6.sayac6--;
                }
            }

        }
        if (collision8()) {

            if (y + ya < game.block7.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block7.sayac7 >= 0) {
                    score++;
                    game.block7.sayac7--;
                }

            } else if (y + ya > game.block7.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block7.sayac7 >= 0) {
                    score++;
                    game.block7.sayac7--;
                }
            } else if (x + xa < game.block7.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block7.sayac7 >= 0) {
                    score++;
                    game.block7.sayac7--;
                }
            } else if (x + xa > game.block7.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block7.sayac7 >= 0) {
                    score++;
                    game.block7.sayac7--;
                }
            }

        }
        if (collision9()) {

            if (y + ya < game.block8.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block8.sayac8 >= 0) {
                    score++;
                    game.block8.sayac8--;
                }

            } else if (y + ya > game.block8.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block8.sayac8 >= 0) {
                    score++;
                    game.block8.sayac8--;
                }
            } else if (x + xa < game.block8.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block8.sayac8 >= 0) {
                    score++;
                    game.block8.sayac8--;
                }
            } else if (x + xa > game.block8.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block8.sayac8 >= 0) {
                    score++;
                    game.block8.sayac8--;
                }
            }

        }
        if (collision10()) {

            if (y + ya < game.block9.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block9.sayac9 >= 0) {
                    score++;
                    game.block9.sayac9--;
                }

            } else if (y + ya > game.block9.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block9.sayac9 >= 0) {
                    score++;
                    game.block9.sayac9--;
                }
            } else if (x + xa < game.block9.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block9.sayac9 >= 0) {
                    score++;
                    game.block9.sayac9--;
                }
            } else if (x + xa > game.block9.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block9.sayac9 >= 0) {
                    score++;
                    game.block9.sayac9--;
                }
            }

        }
        if (collision11()) {

            if (y + ya < game.block10.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block10.sayac10 >= 0) {
                    score++;
                    game.block10.sayac10--;
                }

            } else if (y + ya > game.block10.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block10.sayac10 >= 0) {
                    score++;
                    game.block10.sayac10--;
                }
            } else if (x + xa < game.block10.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block10.sayac10 >= 0) {
                    score++;
                    game.block10.sayac10--;
                }
            } else if (x + xa > game.block10.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block10.sayac10 >= 0) {
                    score++;
                    game.block10.sayac10--;
                }
            }

        }
        if (collision12()) {

            if (y + ya < game.block11.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block11.sayac11 >= 0) {
                    score++;
                    game.block11.sayac11--;
                }

            } else if (y + ya > game.block11.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block11.sayac11 >= 0) {
                    score++;
                    game.block11.sayac11--;
                }
            } else if (x + xa < game.block11.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block11.sayac11 >= 0) {
                    score++;
                    game.block11.sayac11--;
                }
            } else if (x + xa > game.block11.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block11.sayac11 >= 0) {
                    score++;
                    game.block11.sayac11--;
                }
            }

        }
        if (collision13()) {

            if (y + ya < game.block12.getBotY() - DIAMETER) {
                ya = -2;
                if (game.block12.sayac12 >= 0) {
                    score++;
                    game.block12.sayac12--;
                }

            } else if (y + ya > game.block12.getTopY() - DIAMETER) {
                ya = 2;
                if (game.block12.sayac12 >= 0) {
                    score++;
                    game.block12.sayac12--;
                }
            } else if (x + xa < game.block12.getLeftX() - DIAMETER) {
                xa = 2;
                if (game.block12.sayac12 >= 0) {
                    score++;
                    game.block12.sayac12--;
                }
            } else if (x + xa > game.block12.getRightX() - DIAMETER) {
                xa = -2;
                if (game.block12.sayac12 >= 0) {
                    score++;
                    game.block12.sayac12--;
                }
            }

        }

        x = x + xa;
        y = y + ya;
    }

    private boolean collision() {
        return game.racquet.getBounds().intersects(getBounds());
    }

    private boolean collision2() {

        return game.block1.getBounds().intersects(getBounds());

    }

    private boolean collision3() {

        return game.block2.getBounds().intersects(getBounds());

    }

    private boolean collision4() {

        return game.block3.getBounds().intersects(getBounds());

    }

    private boolean collision5() {

        return game.block4.getBounds().intersects(getBounds());

    }

    private boolean collision6() {

        return game.block5.getBounds().intersects(getBounds());

    }

    private boolean collision7() {

        return game.block6.getBounds().intersects(getBounds());

    }

    private boolean collision8() {

        return game.block7.getBounds().intersects(getBounds());

    }

    private boolean collision9() {

        return game.block8.getBounds().intersects(getBounds());

    }

    private boolean collision10() {

        return game.block9.getBounds().intersects(getBounds());

    }

    private boolean collision11() {

        return game.block10.getBounds().intersects(getBounds());

    }

    private boolean collision12() {

        return game.block11.getBounds().intersects(getBounds());

    }

    private boolean collision13() {

        return game.block12.getBounds().intersects(getBounds());

    }

    public void paint(Graphics2D g) {

        g.setPaint(Color.CYAN);
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }

    public Rectangle getBounds() {
        return new Rectangle(x - 1, y - 1, DIAMETER + 1, DIAMETER + 1);
    }
}
