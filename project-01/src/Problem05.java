import processing.core.*;

public class Problem05 extends PApplet {
    float bigBox;
    int bigBoxSide;
    float boxSize;
    float x, y;
    int n;
    String color;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        bigBox = (float)Math.min(height * 0.75, width * 0.75);
    }

    public void draw() {
        background(0, 0, 0);
        bigBoxSide = 8 + n;
        boxSize = bigBox / bigBoxSide;
        x = width / 2f - bigBox / 2f;
        y = height / 2f - bigBox / 2f;
        for (int i = 0; i < bigBoxSide * bigBoxSide; i++) {
            int i1 = i % bigBoxSide;
            int i2 = i / bigBoxSide;

            if (mouseX >= x + boxSize * i1 &&
                    mouseX <= x + boxSize * (i1 + 1) &&
                    mouseY >= y + boxSize * i2 &&
                    mouseY <= y + boxSize * (i2 + 1)) {
                stroke(0, 255, 0);
                textSize(bigBox / 15);
                textAlign(CENTER, BOTTOM);
                fill(0, 255, 0);
                if ((i1 + i2 + 1) % 2 == 0) {
                    color = "White";
                } else {
                    color = "Black";
                }
                text("Rows: " + i2 + "; Column: " + i1 + "; Color: " + color, width / 2f, height / 10f);
                stroke(255, 0, 0);
                strokeWeight(5);
            } else {
                noStroke();
            }

            if ((i1 + i2 + 1) % 2 == 0) {
                fill(255, 255, 255);
            } else {
                fill(25, 25, 25);
            }
            square(x + boxSize * i1, y + boxSize * i2, boxSize);

            stroke(0, 255, 0);
            textSize(bigBox / 16);
            textAlign(CENTER, BOTTOM);
            fill(0, 220, 254);
            text("size " + bigBoxSide + ": use +/- to change size [4..12]", width / 2f, height * 19 / 20f);
        }
    }
    public void keyPressed() {
        if (key == '=') {
            if (n < 4) {
                n++;
            }
        }
        if (key == '-') {
            if (n > -4) {
                n--;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}