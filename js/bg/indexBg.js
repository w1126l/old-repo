
var stars=[];//array of stars

var canvas;

function setup(){
  canvas = createCanvas(windowWidth, windowHeight);
  canvas.position(0, 0, 'fixed');
  canvas.style('z-index', '-100');
  noStroke();

  for (var i = 0; i < 800; i++) {
    stars[i]=new movingStar();
  }
}

function draw(){
  background(11,39,64);//background(red,green,blue);
  translate(width/2,height/2);//set center points
  for (let i = 0; i < stars.length; i++) {
    stars[i].updateLocation();
    stars[i].createStar();
  }
}

//star object
function movingStar(){
  this.x=random(-width,width);//random value between -width and width
  this.y=random(-height,height);//random value between -height and height
  this.z=random(width);//random up to width

  this.updateLocation=function(){
    this.z=this.z-1;//set new z-location

    if(this.z<1){
      this.z=width;
    }
  }

  this.createStar=function(){
    fill (255);
    noStroke ();
    //Re-scale x and y
    var sx=map(this.x/this.z,0,1,0,width);
    var sy=map(this.y/this.z,0,1,0,height);
    ellipse(sx,sy,8,8);//ellipse(locationX,locationY,sizeX,sizeY);
  }
}
