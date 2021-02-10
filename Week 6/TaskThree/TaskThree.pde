color cRed = color(255, 0, 0);
color yellow = color(255, 255, 0);
color cGreen = color(0, 255, 0);
color black = color(0, 0, 0);
int time;
int oldTime;
boolean red = false;
boolean green = false;

void setup() {
  size(200, 500);
  background(255);
  rectMode(CORNERS);
  ellipseMode(CENTER);
  
  //Black bg
  fill(black);
  rect(20,20, 180, 480);
  
  //Lights
  noStroke();
  fill(cRed);
  ellipse(100, 100, 125, 125);
  fill(150);
  ellipse(100, 250, 125, 125);
  ellipse(100, 400, 125, 125);
}

void draw() {
  time = millis();
  
  if (time > oldTime+2000) {
    if (red) {
      //Yellow off
      fill(150);
      ellipse(100, 250, 125, 125);
    
      //Red on
      fill(cRed);
      ellipse(100, 100, 125, 125);
      
      red = false;
    } else if (green) {
      //Red off
      fill(150);
      ellipse(100, 100, 125, 125);
      
      //Yellow off
      fill(150);
      ellipse(100, 250, 125, 125);
    
      //Green on
      fill(cGreen);
      ellipse(100, 400, 125, 125);
      
      green = false;
    }
  }
}

void mousePressed() {
  //Green off
  fill(150);
  ellipse(100, 400, 125, 125);
  
  //Yellow on
  fill(yellow);
  ellipse(100, 250, 125, 125);
  oldTime = time;
  red = true;
}

void keyPressed() {
  //Yellow on
  fill(yellow);
  ellipse(100, 250, 125, 125);
  
  oldTime = time;
  green = true;
}
