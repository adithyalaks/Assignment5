package ca.mcgill.ecse202.a5;


public class MyRectangle2D {
private double x;
private double y;
private double width;
private double height;

MyRectangle2D() {
  x=0;
  y=0;
  height=1;
  width=1;
}

MyRectangle2D(double x, double y, double width, double height){
  this.x=x;
  this.y=y;
  this.width=width;
  this.height=height;
}

public double getArea(){
  return (this.height)*(this.width);
}

public double getPerimeter(){
  return 2*(this.height+this.width);
}

public boolean contains (double x, double y){
  if (((this.width+0.5*this.x)>=x && (this.width-0.5*this.x)<=x) &&((this.height+0.5*this.y)>=y && (this.height-0.5*this.y)<=y)){
    return true;
  }
  else {
    return false;
  }     
}

public boolean contains(MyRectangle2D a){
if (((a.x-0.5*a.width)>=(this.x-0.5*this.width)) && ((a.y+0.5*a.height)<=(this.y+0.5*a.height)) && ((this.width+0.5*this.x)>=a.x && (this.width-0.5*this.x)<=a.x) && ((this.height+0.5*this.y)>=a.y && (this.height-0.5*this.y)<=a.y)){
  return true;
}
else {
  return false;
}
}

//public boolean overlaps(MyRectangle2D){

/**
 * @return the x
 */
public double getX() {
  return x;
}
/**
 * @param x the x to set
 */
public void setX(double x) {
  this.x = x;
}
/**
 * @return the y
 */
public double getY() {
  return y;
}
/**
 * @param y the y to set
 */
public void setY(double y) {
  this.y = y;
}
/**
 * @return the width
 */
public double getWidth() {
  return width;
}
/**
 * @param width the width to set
 */
public void setWidth(double width) {
  this.width = width;
}
/**
 * @return the height
 */
public double getHeight() {
  return height;
}
/**
 * @param height the height to set
 */
public void setHeight(double height) {
  this.height = height;
}

}

