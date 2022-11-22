import processing.core.*;

public class Problem01 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0, 0,0);
    }
    int moveX = (int) Math.floor(Math.random() * 9) + 7;
    int moveY = (int) Math.floor(Math.random() * 9) + 7;
    int dx = 0;
    int dy = 0;

    public void draw() {

        noStroke();
        rect(0, 0, width, height);
        background(0, 0, 0);
        fill(0, 0 ,255);
        circle(width/4f +dx, height/4f+dy,50);
        if (dx >= width / 4f || dx <= -width / 4f){
            moveX = -moveX;
        }
        if (dx >= width / 4f || dx <= -width / 4f){
            moveY= -moveY;
        }
            dx+=moveX;
            dy+=moveY;















        }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}