import processing.core.*;

public class Problem02 extends PApplet {

    boolean c1= true;
    boolean c2 = false;
    int changePX = 5;
    int size1 = 100;
    int size2 = 100;
    int size3 = 100;
    int maxSize = 300;
    int minSize = 100;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        text("Java Slogan:", width/2f, height/3f);
        text("Write once,", width/2f, height/3f);
        text("run anywhere!", width/2f, height/3f);

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}