
var canvas;

let fr = 60;

var hMap, sMap, bMap;
var backH = 150, backS = 100, backL = 80;

var changeDirection;

var stars = [];

function setup() {

  canvas = createCanvas(windowWidth, windowHeight);
  canvas.position(0,0);
  canvas.style('z-index', '-100');

  colorMode(HSL);

  changeDirection = false;

  for (var i = 0; i < width/2; i++) {

		stars[i] = new Star();

  }

}

function draw() {

  drawBackground();
  background(backgroundColor);
  shiftBackground();

  for (var i = 0; i < stars.length; i++) {

	stars[i].draw();
    stars[i].move();

  }

  console.log(backH);

}

function drawBackground() {

  backgroundColor = color(backH, backS, backL);


}

function shiftBackground() {

  if(backH <= 160) {
    changeDirection = true;
  } else if(backH >= 270) {
    changeDirection = false;
  }

  if (changeDirection == false) {
    backH -= 0.3;
  } else if (changeDirection == true) {
    backH += 0.3;
  }

}
