int timer;
color red = color(255, 0, 0);
color yellow = color(255, 255, 0);
color green = color(0, 255, 0);
color black = color(0, 0, 0);
color grey = color(150, 150, 150);
boolean redLight = true;
boolean greenLight = false;

void setup() {
  size(200, 500);
  background(255);
  rectMode(CORNERS);
  ellipseMode(CENTER);
  frameRate(2);
}

void draw() {

  //Black background
  fill(black);
  rect(20, 20, 180, 480);

  //Lights
  noStroke();
  fill(grey);
  ellipse(100, 100, 125, 125);
  ellipse(100, 250, 125, 125);
  ellipse(100, 400, 125, 125);

  if (millis()-timer > 1000) {
    if (redLight == true) {  
      fill(red);
      ellipse(100, 100, 125, 125);
      redLight = false;
    } else if (redLight == false) {
      fill(green);
      ellipse(100, 400, 125, 125);

      redLight = true;
    }
  }
}
