import processing.core.*;

public class Problem01 extends PApplet {
    static final int SNOW_AMOUNT = 100;

    float[] x = new float[SNOW_AMOUNT];
    float[] y = new float[SNOW_AMOUNT];
    float[] r = new float[SNOW_AMOUNT];
    float[] color = new float[SNOW_AMOUNT];
    float[] angle = new float[SNOW_AMOUNT];
    float[] dAngle = new float[SNOW_AMOUNT];

    public void snowFlake(float rays, float starX, float starY, float radius, float color, float angle) {
        float angleDelta = TWO_PI / rays;
        stroke(color);
        for (int i = 0; i < rays; i++) {
            //draw lines
            float endX = starX + cos(angle) * radius;
            float endY = starY + sin(angle) * radius;
            line(starX, starY, endX, endY);

            angle += angleDelta;
        }
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        strokeWeight(3);

        for (int i = 0; i < SNOW_AMOUNT; i++) {
            x[i] = random(width);
            y[i] = random(height);
            r[i] = random(height / 40f, height / 30f);
            angle[i] = random(2 * PI);
            dAngle[i] = random(-0.02f, 0.01f);
            color[i] = random(20, 255);
        }
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < SNOW_AMOUNT; i++) {
            snowFlake(8, x[i], y[i], r[i], color[i], angle[i]);

            y[i] += r[i] / 5f;
            angle[i] += dAngle[i];

            if (y[i] > height) {
                x[i] = random(width);
                y[i] = -r[i];
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}