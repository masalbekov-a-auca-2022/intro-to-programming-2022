import processing.core.*;

public class Problem06 extends PApplet {
    static final float SUN_D = 250.0f;
    static final int SUN_COLOR = 0xFFFFAA00;

    static final float EARTH_D = SUN_D * 0.2f;
    static final int EARTH_COLOR = 0xFF007BFF;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}