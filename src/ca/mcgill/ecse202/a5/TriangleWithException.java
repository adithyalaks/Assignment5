package ca.mcgill.ecse202.a5;

public class TriangleWithException extends GeometricObject {

 private double side1,side2,side3=1.0;
 
 TriangleWithException() {
   
 }
 
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
 
@Override
public double getArea() {
 double cosAngleSide1=(Math.pow(side2, 2)+ Math.pow(side3, 2)-Math.pow(side1, 2))/(2*side2*side3);
 double AngleSide1= Math.acos(cosAngleSide1);
 double area= 0.5*side2*side3*Math.sin(AngleSide1);
 return area; 
}

@Override
public double getPerimeter() {
  return side1+side2+side3;
}

@Override
public String toString(){
  return "Triangle: side1 = "+ side1+ " side2 = " +side2+ " side3 = "+ side3;
  
}

  
}