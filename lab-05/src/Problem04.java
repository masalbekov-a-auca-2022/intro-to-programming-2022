import processing.core.*;

public class Problem04 extends PApplet {
    static double BALL_AMOUNT = Math.random() * 200;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        for (int i = 0; i < BALL_AMOUNT; i++) {
            float RED = (float) Math.random() * 256;
            float GREEN = (float) Math.random() * 256;
            float BLUE = (float) Math.random() * 256;

            float CIRCLE_X = (float) Math.random() * 1800;
            float CIRCLE_Y = (float) Math.random() * 1800;
            float CIRCLE_E = (float) Math.random() * 75;
            fill(RED, GREEN, BLUE);
            circle(CIRCLE_X, CIRCLE_Y, CIRCLE_E);
        }
    }


    public void draw() {


    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}