import processing.core.*;

public class Problem01 extends PApplet {
    float angle;
    float x;
    float y;
    float r;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = random(width);
        y = random(heigth);
        r = random(width)
    }

    public void draw() {
        background(0, 0, 0);
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}