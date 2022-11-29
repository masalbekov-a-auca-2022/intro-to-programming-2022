import processing.core.*;

public class Problem03 extends PApplet {
    float dx = 0;
    float dy = 0;

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
        circle(width / 4f + dx, height * 2 / 6f + dy, 200);





        if (mouseX > 620 && mouseX < 895 &&
                mouseY > 220 && mouseY < 380) {
            stroke(255, 254, 79);
            strokeWeight(6);
            fill(255, 255, 255);
            textSize(48);
            textAlign(CENTER);
            text("Rectangle", width / 2f, height * 3 / 4f);
        } else {
            noStroke();
        }
        fill(18, 76, 79);
        rect(620, 220, 300, 160);





        if (mouseX > width * 3 / 4f - 100 && mouseX < width * 3 / 4f + 100 &&
                mouseY > height * 2 / 6f - 100 && mouseY < height * 2 / 6f + 100) {
            stroke(255, 254, 79);
            strokeWeight(6);
            fill(255, 255, 255);
            textSize(48);
            textAlign(CENTER);
            text("Ring", width / 2f, height * 3 / 4f);
        } else {
            noStroke();
        }
        fill(0, 0, 255);
        circle(width * 3 / 4f + dx, height * 2 / 6f + dy, 200);
        fill(0, 0, 0);
        circle(width * 3 / 4f + dx, height * 2 / 6f + dy, 140);

    }

    public static void main(String[] args) {
        PApplet.main("Problem03");}
    }

