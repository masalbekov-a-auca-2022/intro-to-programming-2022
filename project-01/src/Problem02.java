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
        textAlign(CENTER,CENTER);
        textSize(size1);
        fill(255,0,0);
        text("Java Slogan:", width/2f, height/3f);
        textSize(size2);
        fill(0,255,0);
        text("Write once,", width/2f, height/2f);
        textSize(size3);
        fill(0,0,255);
        text("run anywhere!", width/2f, height*2/3f);

        if (c1){
            size1 +=changePX;
            c1 = size1!=minSize;
            c2 = size1 == minSize;
            changePX = minSize == size1||maxSize == size1 ? -changePX:changePX;
        }
        else if(c2){
            size2 +=changePX;
            c1 = size2!=minSize;
            c2 = size2 == minSize;
            changePX = minSize == size2||maxSize == size2 ? -changePX:changePX;

        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}