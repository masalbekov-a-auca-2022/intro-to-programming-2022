import processing.core.*;

public class Problem03 extends PApplet {
    float x = 0;
    float y = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        noStroke();
        if (mouseX > width / 4f - 100 && mouseX < width / 4f + 100 &&
                mouseY > height * 2 / 6f - 100 && mouseY < height * 2 / 6f + 100) {
            stroke(255, 254, 79);
            strokeWeight(6);
            fill(255, 255, 255);
            textSize(48);
            textAlign(CENTER);
            text("Circle", width / 2f, height * 3 / 4f);
        } else {
            noStroke();
        }
        fill(255, 0, 0);
        circle(width / 4f + x, height * 2 / 6f + y, 200);
        }

        public static void main (String[]args){
            PApplet.main("Problem03");
        }

    }
