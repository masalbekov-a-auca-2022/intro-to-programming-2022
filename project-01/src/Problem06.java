import processing.core.*;

public class Problem06 extends PApplet {
    static final float SUN_D = 250.0f;

    static final float EARTH_D = SUN_D * 0.3f;
    static final float EARTH_ORBIT = 350.0f;
    static final float EARTH_ORBIT_SPEED = 0.02f;
    float earthOrbitAngle = 0.0f;

    static final float VENUS_D = SUN_D * 0.25f;
    static final float VENUS_ORBIT = 200.0f;
    static final float VENUS_ORBIT_SPEED = 0.04f;
    float venusOrbitAngle = 0.0f;


    static final float MOON_D = SUN_D * 0.15f;
    static final float MOON_ORBIT = 70.0f;
    static final float MOON_ORBIT_SPEED = 0.07f;
    float moonOrbitAngle = 0.0f;



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
        float venusX = sunX + cos(venusOrbitAngle) * VENUS_ORBIT;
        float venusY = sunY + sin(venusOrbitAngle) * VENUS_ORBIT;
        celestialBody(venusX, venusY, VENUS_D, 255, 102, 0, 255);
        venusOrbitAngle += VENUS_ORBIT_SPEED;


        //Moon
        float moonX = earthX + cos(moonOrbitAngle) * MOON_ORBIT;
        float moonY = earthY + sin(moonOrbitAngle) * MOON_ORBIT;
        celestialBody(moonX, moonY, MOON_D, 204, 255, 255, 255);
        moonOrbitAngle += MOON_ORBIT_SPEED;

        //Buttons

        //TODO


    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}