
var canvas;

let fr = 60;

var hMap, sMap, bMap;
var backH = 50, backS = 40, backL = 80;

var changeDirection;

var stars = [];

function setup() {

  canvas = createCanvas(windowWidth, windowHeight);
  canvas.position(0, 0, 'fixed');
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

  if(backH <= 0) {
    changeDirection = true;
  } else if(backH >= 120) {
    changeDirection = false;
  }

  if (changeDirection == false) {
    backH -= 0.1;
  } else if (changeDirection == true) {
    backH += 0.1;
  }

}
