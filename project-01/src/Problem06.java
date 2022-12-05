import processing.core.*;

public class Problem06 extends PApplet {
    static final float SUN_D = 250.0f;

    static final float EARTH_D = SUN_D * 0.2f;
    static final float EARTH_ORBIT = 200.0f;
    static final float EARTH_ORBIT_SPEED = 0.02f;
    float earthOrbitAngle = 0.0f;

    public void celestialBody(float x, float y, float diam, int rColor, int gColor, int bColor, int alpha) {
        noStroke();
        fill(rColor, gColor, bColor, alpha);
        circle(x, y, diam);


    }


    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);


        //Sun
        float sunX = width * 0.5f;
        float sunY = height * 0.5f;
        celestialBody(sunX, sunY, SUN_D, 255, 255, 0, 255 );

        //Earth
        float earthX = sunX + cos(earthOrbitAngle) * EARTH_ORBIT;
        float earthY = sunY + sin(earthOrbitAngle) * EARTH_ORBIT;
        celestialBody(earthX, earthY, EARTH_D, 28, 170, 214, 255);
        earthOrbitAngle += EARTH_ORBIT_SPEED;
        //Venus

        //TODO


    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}