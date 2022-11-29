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
        }

        public static void main (String[]args){
            PApplet.main("Problem03");
        }

    }
}