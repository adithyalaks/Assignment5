package ca.mcgill.ecse202.a5;

public class IllegalTriangleException extends Exception {
//These are the three datafields for the Exception object created.
private double side1, side2,side3;

/**
 * This is a constructor, through which a user can pass by values for the sides of a triangle as arguments.
 * @param side1: this is the length of the first side inputed.
 * @param side2: this is the length of the second side inputed. 
 * @param side3: this is the length of the third side inputed. 
 */
public IllegalTriangleException(double side1, double side2, double side3){
  super("Invalid sides entered"+side1+", "+side2+", "+side3);
  this.side1=side1;
  this.side2=side2;
  this.side3=side3;
}

/**
 * @return the side1
 */
public double getSide1() {
  return side1;
}

/**
 * @return the side2
 */
public double getSide2() {
  return side2;
}

/**
 * @return the side3
 */
public double getSide3() {
  return side3;
}
}
