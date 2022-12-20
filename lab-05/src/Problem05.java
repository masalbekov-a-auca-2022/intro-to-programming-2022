import processing.core.*;

public class Problem05 extends PApplet {
    static final float CIRCLES_AMOUNT = (float) Math.random() * 40;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        float circleE = 50;
        float circleA = 100;

        for (int i = 0; i < CIRCLES_AMOUNT; i++) {
            fill(255, 0, 0,circleA);
            circle(width * 0.5f, height * 0.5f, circleE);

            circleA -= 150/CIRCLES_AMOUNT;
            circleE += 50;
        }
    }

    public void draw() {

    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}