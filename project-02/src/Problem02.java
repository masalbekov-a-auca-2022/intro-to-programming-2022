import processing.core.PApplet;

public class Problem02 extends PApplet {
    public void star(int rays, float x, float y, float outerRadius, float innerRadius, int color, float angle) {
        float angleDelta = TWO_PI / rays;
        stroke(color);
        for (int i = 0; i < rays; i++){
            float radius;

            radius = i % 2 == 0 ? outerRadius : innerRadius;
            float endX1 = x + cos(angle) * radius;
            float endY1 = y + sin(angle) * radius;
            line(x, y, endX1, endY1);

            radius = i % 2 != 0 ? outerRadius : innerRadius;
            float endX2 = x + cos(angle + angleDelta) * radius;
            float endY2 = y + sin(angle + angleDelta) * radius;
            line(endX1, endY1, endX2, endY2);

            angle += angleDelta;
        }

    }
    public void settings() {
        fullScreen();
        frameRate(1);

    }

    public void setup() {

    }
    int r = 0;
    public void draw() {
        background(0);
        clear();


        for (int i =0; i < 1; i++) {
            float x = (float)Math.random()*1000;
            float y = (float)Math.random()*1000;
            pushMatrix();
            translate(width / 2f, height / 2f);
            rotate(radians(r));
            star(16, x, y, 100.0f, 30.0f, 0xFFFFFFFF, 0.0f);
            popMatrix();
            r -= 1;
            y -= 1;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}