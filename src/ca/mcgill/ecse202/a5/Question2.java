package ca.mcgill.ecse202.a5;

import java.util.Scanner;

public class Question2 {

  public static void main(String[] args) {
    // The following few statements request the user to enter values for the three sides of a
    // triangle they wish to create.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides:");
    double[] sides = new double[3];
    for (int i = 0; i < 3; i++) {
      sides[i] = input.nextDouble();
    }
    Triangle t = new Triangle(sides[0], sides[1], sides[2]);
    // Here the user is prompted to enter a color for the triangle, and identify whether it is
    // filled or not.
    System.out.println("Enter the color:");
    t.setColor(input.next());
    System.out.println("Enter a boolean value for filled:");
    t.setFilled(input.nextBoolean());

    // These statements print the area and perimeter, whether the triangle is filled or not, as well
    // as a string representation of the triangle.
    System.out.println("The area is " + t.getArea());
    System.out.println("The perimeter is " + t.getPerimeter());
    System.out.println("The triangle is " + t.isFilled());
    System.out.println("The color of the triangle is " + t.getColor());
    System.out.println(t.toString());

  }

}
