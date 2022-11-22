import processing.core.*;

public class Problem01 extends PApplet {
    int moveX;
    int moveY;
    float dx;
    float dy;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        int moveX = (int) Math.floor(Math.random() * 9) + 7;
        int moveY = (int) Math.floor(Math.random() * 9) + 7;
        dx = 0;
        dy = 0;
    }

    public void draw() {
        noStroke();
        background(0, 0, 0);
        fill(0, 0 ,255);
        circle(width/4f +dx, height/4f+dy,50);
        if (dx >= width / 4 || dx <= -width / 4){
            moveX = -moveX;
        }
        if (dx >= width / 4 || dx <= -width / 4){
            moveY= -moveY;
        }
        dx+=moveX;
        dy+=moveY;















        }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}