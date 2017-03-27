package ca.mcgill.ecse202.a5;

public class Triangle extends GeometricObject {

  private double side1, side2, side3 = 1; // establishes the three relevant data fields for the
                                          // triangle object.


  /**
   * This is a no-arg constructor that creates a triangle objects with the side data fields left
   * holding their default values of 1.
   */
  public Triangle() {

  }

  /**
   * This is a constructor that takes in user specified side lengths as arguments, and then sets the
   * objects' datafield values to those specified.
   * 
   * @param side1 length of the first side
   * @param side2 length of the second side
   * @param side3 length of the third side
   */
  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
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
    double s = (this.side1 + this.side2 + this.side3) / 2;
    double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
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
    return side1 + side2 + side3;
  }

  /*
   * (non-Javadoc)
   * 
   * @see ca.mcgill.ecse202.a5.GeometricObject#toString() This overridden method returns a string
   * describing a triangle in terms of its three sides.
   */
  @Override
  public String toString() {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

  }


}
