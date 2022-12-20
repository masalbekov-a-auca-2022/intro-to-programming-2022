import processing.core.PApplet;

public class Problem06 extends PApplet {
    int r = 0;

    // earth coordinates
    int ex = 300;
    int ey = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(70);
        noStroke();
    }

    public void draw() {
        stroke(2);
        background(0);
        clear();

        pushMatrix();
        translate(width / 2f, height / 2f);
        rotate(radians(r));

        // Sun
        fill(255, 255, 0);
        circle(0, 0, 200);

        // Earth
        fill(0, 255, 20);
        circle(ex, ey, 70);

        //Venus
        fill(255,120,0);
        circle(212, 120,50);

        // moon
        translate(ex, ey);
        rotate(radians(-r * 3));
        fill(255);
        circle(50, ey, 25);
        popMatrix();



        // table Sun
        fill(0, 0, 255);
        rect(width - 150, 0, 150, 70);

        fill(255, 255, 255);
        text("Sun", width - 120, 50);
        textSize(60);

        // table Earth
        fill(0, 0, 255);
        rect(width - 150, 72, 150, 70);

        fill(255, 255, 255);
        text("Earth", width - 140, 125);
        textSize(60);

        // table Moon
        fill(0, 0, 255);
        rect(width - 150, 144, 150, 70);

        fill(255, 255, 255);
        text("Moon", width - 140, 200);
        textSize(60);

        if (mouseX >= width - 150 && mouseX <= width && mouseY >= 0 && mouseY <= 70) {

            stroke(255, 0, 0);
            fill(0, 0);
            circle(width / 2f, height / 2f, 215);
            strokeWeight(3);

        } else if (mouseX >= width - 150 && mouseX <= width && mouseY >= 71 && mouseY <= 141) {

            stroke(255, 0, 0);
            fill(0, 0);
            circle(width / 2f, height / 2f, 600);
            strokeWeight(3);


        } else if (mouseX >= width - 150 && mouseX <= width && mouseY >= 142 && mouseY <= 212) {
            stroke(255, 0, 0);
            fill(0, 0);
            pushMatrix();
            translate(width / 2f, height / 2f);
            rotate(radians(r));
            circle(ex, ey, 100);
            popMatrix();

        } else {
            noStroke();
        }

        r -= 1;
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}