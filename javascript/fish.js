
var yoff = 0;
var level1 = 200;
var level2 = 250;

function setup() {
  createCanvas(windowWidth, windowHeight);
}

function draw() {
  frameRate(20);

  background('white');

  drawWater();
  drawFish(random(width), random(230, height));
  drawWater();
}

function drawWater() {
  noStroke();
  fill(random(80, 100), 200, 255, random(130, 150));

  beginShape();
  var xoff = 0;
  for (var x = 0; x <= width; x += 10) {
    var y = map(noise(xoff, yoff), 0, 1, level1, level2);
    vertex(x, y);
    xoff += 0.05;
  }

  yoff += 0.03;
  vertex(width, height);
  vertex(0, height);
  endShape();
}

function drawFish(x, y) {
  noStroke();

  //tail
  fill(226, 52, 60);
  ellipse((x + 60), y, 40, 60);

  //body
  fill(54, 94, 129);
  ellipse(x, y, 100, 70);

  //eye
  fill(255);
  ellipse(x - 18, y - 5, 25);
  fill(0);
  ellipse(x - 18, y - 5, 15);
}
