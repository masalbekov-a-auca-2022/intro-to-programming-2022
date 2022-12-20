import processing.core.*;

public class Problem05 extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Problem05");
        if (args.length != 2) {
            System.out.println("Wrong number of arguments: it must be 2");
            System.exit(0);
        }
        s1 = args[0];
        s2 = args[1];
    }

    public void settings() {
        fullScreen();
    }

    float x1, x2;
    float y1, y2;
    float dx1, dx2;
    static String s1, s2;
    float sizeS1, sizeS2;

    public void setup() {
        x1 = width / 2f;
        x2 = width / 2f;
        y1 = height / 4f;
        y2 = height * 3f / 4;
        textSize(height / 4f);
        sizeS1 = textWidth(s1);
        sizeS2 = textWidth(s2);
        dx1 = (width - sizeS1) / 180f;
        dx2 = -(width - sizeS2) / 180f;
    }

    public void draw() {
        background(0);
        fill(255, 0, 0);
        textAlign(CENTER, CENTER);
        text(s1, x1, y1);
        fill(0, 0, 255);
        textAlign(CENTER);
        text(s2, x2, y2);
        x1 += dx1;
        x2 += dx2;
        if (x1 + sizeS1 / 2f > width || x1 - sizeS1 / 2f < 0) dx1 *= -1;
        if (x2 + sizeS2 / 2f > width || x2 - sizeS2 / 2f < 0) dx2 *= -1;
    }
}