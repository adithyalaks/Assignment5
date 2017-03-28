package ca.mcgill.ecse202.a5;


public class MyRectangle2D {
  private double x; // data field containing the location of the rectangle along the x axis
  private double y; // data field containing the location of the rectangle along the y axis
  private double width;// data field containing the width of the rectangle
  private double height;// data field containing the height of the rectangle

  /**
   * This is the default no arg constructor for the MyRectangle2D class. It sets the location of the
   * centre to (0,0) and sets the height and width to a default value of 1.
   */
  MyRectangle2D() {
    x = 0;
    y = 0;
    height = 1;
    width = 1;
  }

  /**
   * @param x: accepts the user's choice of x coordinate for the center of the rectangle
   * @param y:accepts the user's choice of y coordinate for the center of the rectangle
   * @param width: accepts the user's choice of width for the new rectangle
   * @param height: accepts the user's choice of height for the new rectangle this a constructor for
   *        a MyRectangle2D object, with values for the rectangle's center, width, and height, as
   *        passed to the method by the user.
   */
  MyRectangle2D(double x, double y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }


  /**
   * @return the area of the rectangle that invokes this method.
   */
  public double getArea() {
    // multiplies the width and height of rectangle to find the area
    return (this.height) * (this.width);
  }

  /**
   * @return the perimeter of the rectangle that invokes this method.
   */
  public double getPerimeter() {
    // returns the perimeter by multiplying the sum of the width and the height by 2
    return 2 * (this.height + this.width);
  }

  /**
   * This method evaluates whether a given point, specified in the argument, is contained in the
   * rectangle object that invokes the method.
   * 
   * @param x: the x-coordinate of the point that the user passes to be checked.
   * @param y: the y-coordinate of the point that the user passes to be checked.
   * @return either true or false, depending on whether or not the point is contained within the
   *         rectangle that invokes the method.
   */
  public boolean contains(double x, double y) {
    // checks to see if the entered coordinates are inside the MyRectangle2D object that is
    // accesssing this method and returns true if it does
    // we consider contains to include if it on the edge of the rectangle
    if (((this.x + 0.5 * this.width) > x && (this.x - 0.5 * this.width) < x)
        && ((this.y + 0.5 * this.height) > y && (this.y - 0.5 * this.height) < y)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * This method checks whether a rectangle passed by the user as an argument is contained within
   * the rectangle that invokes the method.
   * 
   * @param r: the rectangle that the user wishes to check for being contained within the rectangle
   *        of the rectangle object that invokes the method.
   * @return either true or false, depending on whether the rectangle passed as an argument is
   *         contained within the rectangle that invokes the method.
   */
  public boolean contains(MyRectangle2D r) {
    double xLowerLeft = r.x - 0.5 * r.width;
    double yLowerLeft = r.y - 0.5 * r.height;
    double xUpperRight = r.x + 0.5 * r.width;
    double yUpperRight = r.y + 0.5 * r.height;

    if (this.contains(xLowerLeft, yLowerLeft) && this.contains(xUpperRight, yUpperRight)) {
      return true;
    } else {
      return false;
    }
  }


  /**
   * This method is a variant of the earlier overlaps method, with the exception that it returns
   * true for points that are on the perimeter of the rectangle that invokes the method.
   * 
   * @param x: This is the x-coordinate of the point that the user wants to check for being in a
   *        rectangle or on its perimeter.
   * @param y: This is the y-coordinate of the point that the user wants to check for being in a
   *        rectangle or on its perimeter.
   * @return: The method returns true if the coordinate passed as an argument is contained in, or is
   *          on the perimeter of the rectangle that invokes the method.Otherwise, it returns false.
   */
  public boolean containsOverlap(double x, double y) {
    if (((this.x + 0.5 * this.width) >= x && (this.x - 0.5 * this.width) <= x)
        && ((this.y + 0.5 * this.height) >= y && (this.y - 0.5 * this.height) <= y)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * This method evaluates whether two rectangles overlap one another.
   * 
   * @param r: the rectangle the user passes as an argument.
   * @return either true or false, depending on whether rectangle that invokes the method overlaps
   *         with the rectangle passed as an argument to the method.
   */
  /**
   * @param r
   * @return
   */
  public boolean overlaps(MyRectangle2D r) {
    double xLowerLeft = r.x - 0.5 * r.width;
    double yLowerLeft = r.y - 0.5 * r.height;
    double xLowerRight = r.x + 0.5 * r.width;
    double yLowerRight = r.y - 0.5 * r.height;
    double xUpperLeft = r.x - 0.5 * r.width;
    double yUpperLeft = r.y + 0.5 * r.height;
    double xUpperRight = r.x + 0.5 * r.width;
    double yUpperRight = r.y + 0.5 * r.height;



    if (this.containsOverlap(xLowerLeft, yLowerLeft)
        || (this.containsOverlap(xUpperRight, yUpperRight))
        || (this.containsOverlap(xLowerRight, yLowerRight))
        || (this.containsOverlap(xUpperLeft, yUpperLeft))) {
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

