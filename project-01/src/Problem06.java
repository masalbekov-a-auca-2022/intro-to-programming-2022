import processing.core.PApplet;

public class Problem06 extends PApplet {
    int r = 0;

    // earth coordinates
    int center_x = 300;
    int center_y = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(70);
        noStroke();
    }

    public void draw() {
        background(0);

        pushMatrix();
        translate(width / 2f, height / 2f);
        rotate(radians(r));

        // Sun
        fill(255, 255, 0);
        circle(0, 0, 200);

        // Earth
        fill(0, 255, 20);
        circle(center_x, center_y, 70);

        // moon
        translate(center_x, center_y);
        rotate(radians(-r * 3));
        fill(255);
        circle(10, center_y, 25);

        popMatrix();
        r -= 1;

    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}