import processing.core.*;

public class Problem02 extends PApplet {

    public void star(int rays, float x, float y, float r1, float r2, int color, float angle) {
        float angleDelta = TWO_PI / rays;
        stroke(color);
        strokeWeith(2);
        for (int i = 0; i < rays; i++) {
            float r = i%2==0 ? r1 : r2;
            float endX =x+cos(angle);
            float endY=y+sin(angle);
            line(x, y, endX, endY);
            angle += angleDelta;

        }


    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        star(8, width*0.5f, heigth *0.5f, 200.0f, 100.0f, 0xFFFF0000, 0.0f);
    }

    public void draw() {
        background(0, 0, 0);
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}