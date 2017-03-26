package ca.mcgill.ecse202.a5;
import java.util.Scanner;

public class Question3 {



  public static void main(String[] args) {
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
      double y = (Math.random() * 100000);
      array[i] = (int) (y);
    }

    boolean indexNotPrinted = true;
    while (indexNotPrinted) {
      try {
        System.out.println("Enter and index of the list:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(array[x] + " is the int at index " + x);
        input.close();
        indexNotPrinted = false;
      }
        catch (Exception IndexOutOfBoundsException) {
        System.out.println("Out of Bounds.");
      }
    }
  }
}


