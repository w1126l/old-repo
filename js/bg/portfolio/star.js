
class Star {

  constructor() {

    this.x = random(width);
	  this.y = random(height);
	  this.size = random(0.25, 10);
	  this.t = random(TAU);

  }

  draw() {

    this.y += random(0.01, 0.5);
    this.t += 0.1;
  	var scale = this.size + sin(this.t) * 2;
  	noStroke();
  	ellipse(this.x, this.y, scale, scale);

  }

  move() {

    this.rotation++;

    if (this.y <= height * 1.0) {
      this.y += 0.5;
    } else {
      this.y = 0;
    }

  }
}
