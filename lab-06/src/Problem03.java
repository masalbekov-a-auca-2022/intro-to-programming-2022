import processing.core.*;

public class Problem03 extends PApplet {
    public void settings() {
        fullScreen();
    }

    float angleBig = 0;
    float dAngleBig = 0.02f;
    float[] angles = {0, 0, 0, 0};
    float[] dAngles = {-0.02f, 0.1f, 0.015f, -0.04f};
    float[] x = new float[4];
    float[] y = new float[4];

    public void setup() {
        x[0] = width / 4f;
        y[0] = height / 4f;
        x[1] = width / 4f;
        y[1] = height * 3f / 4;
        x[2] = width * 3f / 4;
        y[2] = height / 4f;
        x[3] = width * 3f / 4;
        y[3] = height * 3f / 4;
    }

    public void draw() {
        background(0);
        pushMatrix();
        translate(width / 2f, height / 2f);
        rotate(angleBig);
        drawStar(0, 0, height / 8f, 255, 0, 0);
        angleBig += dAngleBig;
        popMatrix();
        for (int i = 0; i < 4; i++) {
            pushMatrix();
            translate(x[i], y[i]);
            rotate(angles[i]);
            drawStar(0, 0, height / 16f, 255, 255, 0);
            angles[i] += dAngles[i];
            popMatrix();
        }
    }

    public void drawStar(float x, float y, float radius, int r, int g, int b) {
        pushMatrix();
        translate(x, y);
        stroke(r, g, b);
        strokeWeight(height / 250f);
        line(-radius, 0, radius, 0);
        line(0, -radius, 0, radius);
        float smallR = radius / 4f;
        line(smallR, smallR, -smallR, -smallR);
        line(smallR, -smallR, -smallR, smallR);
        line(0, -smallR, 0, smallR);
        popMatrix();
        line(x + smallR, y - smallR, x, y - radius);
        line(x - smallR, y - smallR, x, y - radius);
        line(x + smallR, y - smallR, x + radius, y);
        line(x + smallR, y + smallR, x + radius, y);
        line(x - smallR, y - smallR, x - radius, y);
        line(x - smallR, y + smallR, x - radius, y);
        line(x + smallR, y + smallR, x, y + radius);
        line(x - smallR, y + smallR, x, y + radius);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}