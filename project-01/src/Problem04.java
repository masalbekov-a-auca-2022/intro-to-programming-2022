import processing.core.*;

public class Problem04 extends PApplet {
    static final int ROWS = 20;
    static final int COLS = 20;
    int LINE_COLOR = 0xFF0000FF;
    float LINE_WEIGHT = 3.0f;
    float CELL_GAP = 0.04f;
    float dx = 0;
    float dy =0;

    public void settings() {
        fullScreen();
    }
    public void keyPressed(){

    }


    public void setup() {

    }

    public void draw() {
        background(0,0,0);
        stroke(LINE_COLOR);
        strokeWeight(LINE_WEIGHT);
        noFill();
        float CELL_SIZE = (Math.min(width / COLS, height / ROWS)) * (1.0f - CELL_GAP);
        float cx = (width - ROWS * CELL_SIZE) * 0.5f;
        float cy = (height - ROWS * CELL_SIZE) * 0.5f;


        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                float x = cx + j * CELL_SIZE;
                float y = cy + i * CELL_SIZE;
                rect(x, y, CELL_SIZE, CELL_SIZE);

            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}