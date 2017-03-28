package ca.mcgill.ecse202.a5;

public class Question1 {
  public static void main(String[] args) {
    MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
    // The following code tests the my rectangle class by using its methods on the MyRectangle2D
    // object r1
    System.out.println(r1.getArea());
    System.out.println(r1.getPerimeter());
    System.out.println(r1.contains(3, 3));
    System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));// This ought to return
                                                                        // false.
    System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));// This ought to return true.
  }
}
