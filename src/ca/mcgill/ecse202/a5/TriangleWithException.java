package ca.mcgill.ecse202.a5;

public class TriangleWithException extends GeometricObject {

 private double side1,side2,side3=1.0;
 
 /**
 * This is a no-arg constructor that can be invoked to create a triangle of object of sides 1 in length.
 */
TriangleWithException() {
   
 }
 
 /**
 *This is a constructor which creates a triangle object with sides specified by the user in the argument. 
 * @param side1: length of the first side of the triangle.
 * @param side2: length of the second side of the triangle.
 * @param side3: length of the third side of the triangle. 
 * @throws IllegalTriangleException: throws an IllegalTriangleException defined in IllegalTriangleException.java.
 */
public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException{
   if ((side1+side2<=side3) || (side1+side3<=side2) || (side2+side3<=side1)){
     throw new IllegalTriangleException(side1, side2, side3);
   }
   
   else{
   this.side1=side1;
   this.side2=side2;
   this.side3=side3;
   }
   
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
/*
 * (non-Javadoc)
 * 
 * @see ca.mcgill.ecse202.a5.GeometricObject#getArea() This inherited method determines the area
 * of the triangle that invokes it, using a formula known as Heron's formula. The formula makes
 * use of the length of a triangles' three sides. The method returns the value of the area as a
 * double.
 */
@Override
public double getArea() {
 double cosAngleSide1=(Math.pow(side2, 2)+ Math.pow(side3, 2)-Math.pow(side1, 2))/(2*side2*side3);
 double AngleSide1= Math.acos(cosAngleSide1);
 double area= 0.5*side2*side3*Math.sin(AngleSide1);
 return area; 
}
/*
 * (non-Javadoc)
 * 
 * @see ca.mcgill.ecse202.a5.GeometricObject#getPerimeter() This overidden method determines the
 * perimeter of a triangle given the length of its' three sides, and returns this value as a
 * double.
 */
@Override
public double getPerimeter() {
  return side1+side2+side3;
}
/*
 * (non-Javadoc)
 * 
 * @see ca.mcgill.ecse202.a5.GeometricObject#toString() This overridden method returns a string
 * describing a triangle in terms of its three sides.
 */
@Override
public String toString(){
  return "Triangle: side1 = "+ side1+ " side2 = " +side2+ " side3 = "+ side3;
  
}

  
}