import processing.core.*;

public class Problem02 extends PApplet {
    static final int FLAKE_AMOUNT = 200;
    static final int BALL_COLOR = 0xFFFFFFFF;
    static final float FLAKE_MAX_SPEED = 5.0f;
    static final float FLAKE_MAX_ROTATION_SPEED = 0.1f;


    float[] xs = new float[FLAKE_AMOUNT];
    float[] ys = new float[FLAKE_AMOUNT];
    float[] dxs = new float[FLAKE_AMOUNT];
    float[] dys = new float[FLAKE_AMOUNT];
    float[] angles = new float[FLAKE_AMOUNT];
    float[] angleDeltas = new float[FLAKE_AMOUNT];
    float[] flakeDiam = new float[FLAKE_AMOUNT];
    float[] flakeRad = new float[FLAKE_AMOUNT];
    float[] r = new float[FLAKE_AMOUNT];
    float[] g = new float[FLAKE_AMOUNT];
    float[] b = new float[FLAKE_AMOUNT];


    public void snowFlake(int rays, float x, float y, float r1, float r2, int color, float angle, float r,
                          float g, float b) {
        float angleDelta = TWO_PI / rays;
        stroke(color);
        for (int i = 0; i < rays; i++) {
            float radius = i % 2 == 0 ? r1 : r2;
            float endX = x + cos(angle) * radius;
            float endY = y + sin(angle) * radius;
            stroke(r, g, b);
            line(x, y, endX, endY);
            stroke(r, g, b);
            angle += angleDelta;
        }
    }


    public void settings() {
        size(1000, 1000);
        fullScreen();
    }

    public void setup() {
        for (int i = 0; i < FLAKE_AMOUNT; i++) {
            xs[i] = random(width);
            ys[i] = random(height);
            dxs[i] = random(-FLAKE_MAX_SPEED, FLAKE_MAX_SPEED);
            dys[i] = random(-FLAKE_MAX_SPEED, FLAKE_MAX_SPEED);
            angles[i] = random(TWO_PI);
            angleDeltas[i] = random(-FLAKE_MAX_ROTATION_SPEED, FLAKE_MAX_ROTATION_SPEED);
            flakeDiam[i] = random(10, 20);
            flakeRad[i] = random(10 * 0.5f, 20 * 0.5f);
            r[i] = random(10, 255);
            g[i] = random(10, 255);
            b[i] = random(10, 255);
        }
    }

    public void draw() {
        noStroke();
        fill(0, 0, 0, 100);
        rect(0, 0, width, height);

        for (int i = 0; i < FLAKE_AMOUNT; i++) {
            snowFlake(12, xs[i], ys[i], flakeDiam[i], flakeDiam[i], BALL_COLOR, angles[i], r[i], g[i], b[i]);
            xs[i] += dxs[i];
            if (xs[i] - flakeRad[i] < 0 || xs[i] + flakeRad[i] > width) dxs[i] = -dxs[i];
            ys[i] += dys[i];
            if (ys[i] - flakeRad[i] < 0 || ys[i] + flakeRad[i] > width) dys[i] = -dys[i];
            angles[i] += angleDeltas[i];

        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}