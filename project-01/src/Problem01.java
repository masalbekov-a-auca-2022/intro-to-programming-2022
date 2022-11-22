import processing.core.*;

public class Problem01 extends PApplet {
    float x;
    float y;
    float dx;
    float dy;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width/2f;
        y = height/2f;
        dx = random(-10,10);
        dy = random(-10,10);
        frameRate(40);

    }

    public void draw() {
        background(0, 0, 0);
        fill(0, 0 ,255);
        circle(x, y, 50);
        y += dy;
        if(y>=height){
            y = height - 1;
            dy = -dy;
        }
        if(y < 0){
            y = 0;
            dy = -dy;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}