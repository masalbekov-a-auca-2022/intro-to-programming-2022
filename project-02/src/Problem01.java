import processing.core.*;

public class Problem01 extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

    public void settings() {
        fullScreen();
    }

    int SNOW_AMOUNT = 100;
    float[] x = new float[SNOW_AMOUNT];
    float[] y = new float[SNOW_AMOUNT];
    float[] r = new float[SNOW_AMOUNT];
    float[] angle = new float[SNOW_AMOUNT];
    float[] dAngle = new float[SNOW_AMOUNT];
    float[] dY = new float[SNOW_AMOUNT];
    float minR;
    float maxR;

    public void setup() {
        minR = width / 140f;
        maxR = width / 70f;
        for (int i = 0; i < SNOW_AMOUNT; i++) {
            x[i] = -1;
            y[i] = -1;
            r[i] = -1;
            angle[i] = -1;
            dAngle[i] = -1;
            dY[i] = -1;
        }
    }

    public void draw() {
        background(0);
        for (int i = 0; i < SNOW_AMOUNT; i++) {
            x[i] = x[i] == -1 ? random(width) : x[i];
            y[i] = y[i] == -1 ? random(height) : y[i];
            r[i] = r[i] == -1 ? random(minR, maxR) : r[i];
            angle[i] = angle[i] == -1 ? random(-PI / 4, PI / 4) : angle[i];
            dAngle[i] = dAngle[i] == -1 ? random(-PI / 200, PI / 200) : dAngle[i];
            dY[i] = dY[i] == -1 ? random(height / 200f, height / 100f) : dY[i];
            pushMatrix();
            translate(x[i], y[i]);
            rotate(angle[i]);
            drawStar(r[i]);
            angle[i] += dAngle[i];
            popMatrix();
            y[i] += dY[i];
            if(y[i] >= height + 2 * r[i]) {
                x[i] = -1;
                y[i] = -maxR;
                r[i] = -1;
                angle[i] = -1;
                dAngle[i] = -1;
                dY[i] = -1;
            }
        }
    }

    public void drawStar(float r) {
        int minWhite = 70;
        int maxWhite = 255;
        float white = map(r, minR, maxR, minWhite, maxWhite);
        stroke(white);
        strokeWeight(r / 8f);
        line(-r, 0, r, 0);
        line(0, r, 0, -r);
        pushMatrix();
        rotate(PI / 4);
        line(-sqrt(2) * r, 0, sqrt(2) * r, 0);
        line(0, sqrt(2) * r, 0, -sqrt(2) * r);
        popMatrix();
    }
}