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
  if (((this.x+0.5*this.width)>=x && (this.x-0.5*this.width)<=x) &&((this.y+0.5*this.height)>=y && (this.y-0.5*this.height)<=y)){
    return true;
  }
  else {
    return false;
  }     
}

public boolean contains(MyRectangle2D r){
double xLowerLeft= r.x-0.5*r.width;
double yLowerLeft=r.y-0.5*r.height;
double xUpperRight=r.x+0.5*r.width;
double yUpperRight=r.y+0.5*r.height;

if ( this.contains(xLowerLeft,yLowerLeft)&& this.contains(xUpperRight,yUpperRight)){
  return true;
}
else {
  return false;
}
}

public boolean overlaps(MyRectangle2D r){
  double xLowerLeft= r.x-0.5*r.width;
  double yLowerLeft=r.y-0.5*r.height;
  double xLowerRight= r.x+0.5*r.width;
  double yLowerRight=r.y-0.5*r.height;
  double xUpperLeft=r.x-0.5*r.width;
  double yUpperLeft=r.y+0.5*r.height;
  double xUpperRight=r.x+0.5*r.width;
  double yUpperRight=r.y+0.5*r.height;
  
  if (this.contains(xLowerLeft,yLowerLeft) || (this.contains(xUpperRight, yUpperRight)) ||(this.contains(xLowerRight, yLowerRight)) ||(this.contains(xUpperLeft, yUpperLeft))){
    return true;
  }
  
  else {
    return false;
  }
}

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

