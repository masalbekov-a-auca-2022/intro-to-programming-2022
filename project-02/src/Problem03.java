import processing.core.PApplet;

public class Problem03 extends PApplet {
    public void settings() {
        fullScreen();
    }

    int n = 150;
    float[] x = new float[n];
    float[] y = new float[n];
    float[] r = new float[n];
    float centerX;
    float centerY;
    int[] rgb = new int[n];
    float dScale = 1.014f;
    float minR;
    float rNoCircles;

    public void setup() {
        background(0);
        centerX = width / 2f;
        centerY = height / 2f;
        minR = width / 1000f;
        rNoCircles = width / 15f;
        for (int i = 0; i < n; i++) {
            do {
                x[i] = random(-centerX, centerX);
                y[i] = random(-centerY, centerY);
            } while ((Math.pow(x[i], 2) + Math.pow(y[i], 2) < Math.pow(rNoCircles, 2)));
            rgb[i] = (int) random(3);
            r[i] = minR;
        }
    }

    public void draw() {
        noStroke();
        fill(0, 50);
        rect(0, 0, width, height);
        translate(centerX, centerY);
        for (int i = 0; i < n; i++) {
            int[] c = getRgb(rgb[i]);
            fill(c[0], c[1], c[2]);
            circle(x[i], y[i], r[i]);
            x[i] *= dScale;
            y[i] *= dScale;
            r[i] *= dScale;
            if(x[i] > centerX + r[i] || x[i] < -centerX - r[i] || y[i] > centerY + r[i] || y[i] < -centerY - r[i]) {
                do {
                    x[i] = random(-centerX, centerX);
                    y[i] = random(-centerY, centerY);
                } while ((Math.pow(x[i], 2) + Math.pow(y[i], 2) < Math.pow(rNoCircles, 2)));
                rgb[i] = (int) random(3);
                r[i] = minR;
            }
        }
    }

    public int[] getRgb(int c) {
        return switch (c) {
            case 0 -> new int[]{255, 0, 0};
            case 1 -> new int[]{0, 255, 0};
            case 2 -> new int[]{0, 0, 255};
            default -> null;
        };
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}