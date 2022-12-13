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

    float buttonWidth;
    float buttonHeight;
    float buttonsX;
    float venusBy;
    float earthBy;
    float sunBy;




    public void celestialBody(float x, float y, float diam, int rColor, int gColor, int bColor, int alpha) {
        noStroke();
        fill(rColor, gColor, bColor, alpha);
        circle(x, y, diam);
    }

    public void buttons(String text, float x, float y){
        fill(0,0,255);
        stroke(255);
        strokeWeight(5);
        rect(x, y, buttonWidth, buttonHeight);
        fill(255);
        textAlign(CENTER);
        textSize(buttonHeight*.8f);
        if (isMouseInsideRect(x, y, buttonWidth, buttonHeight)){
            buttonAction(text);
            fill(255);
        }
    }
    public


    public void settings() {
        fullScreen();
    }

    public void setup() {
        buttonWidth = width/5f;
        buttonHeight = height/15f;
    }

    public void draw() {
        background(0, 0, 0);

        //Sun
        float sunX = width * 0.5f;
        float sunY = height * 0.5f;

        //Earth
        float earthX = sunX + cos(earthOrbitAngle) * EARTH_ORBIT;
        float earthY = sunY + sin(earthOrbitAngle) * EARTH_ORBIT;

        //Venus
        float venusX = sunX + cos(venusOrbitAngle) * VENUS_ORBIT;
        float venusY = sunY + sin(venusOrbitAngle) * VENUS_ORBIT;

        //Moon
        float moonX = earthX + cos(moonOrbitAngle) * MOON_ORBIT;
        float moonY = earthY + sin(moonOrbitAngle) * MOON_ORBIT;


        //SunDraw
        celestialBody(sunX, sunY, SUN_D, 255, 255, 0, 255 );

        //EarthDraw
        celestialBody(earthX, earthY, EARTH_D, 28, 170, 214, 255);
        earthOrbitAngle += EARTH_ORBIT_SPEED;

        //VenusDraw
        celestialBody(venusX, venusY, VENUS_D, 255, 102, 0, 255);
        venusOrbitAngle += VENUS_ORBIT_SPEED;

        //MoonDraw
        celestialBody(moonX, moonY, MOON_D, 204, 255, 255, 255);
        moonOrbitAngle += MOON_ORBIT_SPEED;


        //SunButton
        if (mouseX < 1500 && mouseX > 1200 && mouseY > 20 && mouseY < 100){
            stroke(255, 0 , 0);
            strokeWeight(7.0f);
            fill(0,0,0,0);
            circle(sunX,sunY, SUN_D);
        } else {
            noStroke();
        }
        fill(0,0,255);
        rect(1200, 20, 300, 70);

        //EarthButton
        if  (mouseX < 1500 && mouseX > 1200 && mouseY > 100 && mouseY < 170){
            buttons(sunX, sunY, SUN_D, EARTH_ORBIT);
        } else {
            noStroke();
        }
        fill(0,0,255);
        rect(1200, 20, 300, 160);














        //TODO


    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}