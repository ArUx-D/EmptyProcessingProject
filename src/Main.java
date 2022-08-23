import MyPApplet.MyPApplet;
import processing.core.*;

public class Main extends MyPApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        //fullScreen();
        size(200, 200);//2340);//1280);
        this.poh = this.displayHeight / 90f; // height unit
        //size(displayWidth, displayHeight);
    }

    @Override
    public void setup() {
        rectMode(CORNERS);
        //size(1080, 1000);//2340);//1280);
        fill(255);
        frameRate(60);
        background(0);
        textAlign(LEFT);

        surface.setTitle("Empty project");
        //surface.setResizable(false);
        surface.setLocation(this.displayWidth / 2 - this.sketchWidth()/2, this.displayHeight / 4);
    }

    @Override
    public void draw() {
        background(0);

        text("Hello World!", mouseX, mouseY);

    }

}
