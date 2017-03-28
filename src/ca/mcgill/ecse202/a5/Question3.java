package ca.mcgill.ecse202.a5;

import java.util.Scanner;

public class Question3 {



  public static void main(String[] args) {
    int[] array = new int[100]; // creates new int array that can contain 100 ints
    // the following code assigns a random integer between 0 and 100000 to each element of the array
    // using a for loop
    for (int i = 0; i < array.length; i++) {
      double y = (Math.random() * 100000); // generates the random number as a double
      array[i] = (int) (y); // converts the random double to an int and assigns it to the current
                            // element of the array
    }
    // this while loops tries the code until the user enters a valid number to access an element of
    // the array
    boolean indexNotPrinted = true;
    while (indexNotPrinted) {
      try {
        System.out.println("Enter an index of the list:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(array[x] + " is the int at index " + x);// if the index inputed by the
                                                                   // user it out of range array[x]
                                                                   // will throw an index out of
                                                                   // bounds exception which will
                                                                   // terminate this block of code
        input.close();
        indexNotPrinted = false; // when the code succeeds because the index is accessible the
                                 // indexNotPrinted variable is set to false to end the for loop
      } catch (Exception IndexOutOfBoundsException) { // this block will catch in the index out of
                                                      // bounds exception and inform the user that
                                                      // the input of out of bounds the code will
                                                      // then run again due to the while loop
        System.out.println("Out of Bounds");
      }
    }
  }
}


