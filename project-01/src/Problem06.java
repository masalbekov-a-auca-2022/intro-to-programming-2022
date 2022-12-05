import processing.core.*;

public class Problem06 extends PApplet {
    static final float SUN_D = 250.0f;
    static final int SUN_COLOR = 0xFFFFAA00;

    static final float EARTH_D = SUN_D * 0.2f;
    static final int EARTH_COLOR = 0xFF007BFF;
    static final float EARTH_ORBIT = 200.0f;
    static final float EARTH_ORBIT_SPEED = 0.02f;
    float earthOrbitAngle = 0.0f;

    public void celestialBody(float x, float y, float diam, int color){
        noStroke();
        fill(color);
        circle(x, y, diam);


    }


    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);


        // Sun
        float sunX = width*0.5f;
        float sunY = height*0.5f;
        celestialBody(sunX, sunY, SUN_D, SUN_COLOR);

        //Earth

        float earthX = width*0.5f;
        float earthY =height*0.5f;
        celestialBody(earthX, earthY, EARTH_D, EARTH_COLOR);
        earthOrbitAngle +=EARTH_ORBIT_SPEED;

        //TODO



    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}