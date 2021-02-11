int timer;
color red = color(255, 0, 0);
color yellow = color(255, 255, 0);
color green = color(0, 255, 0);
color black = color(0, 0, 0);
color grey = color(150, 150, 150);
boolean redLight = true;


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

// alternates colors between red and grey and green and grey
  if (millis()-timer > 1000) {
    if (redLight == true) {  // changes color to red
      fill(red);
      ellipse(100, 100, 125, 125);
      redLight = false;
    } else if (redLight == false) { //changes color to green
      fill(green);
      ellipse(100, 400, 125, 125);

      redLight = true;
    }
  }
}
