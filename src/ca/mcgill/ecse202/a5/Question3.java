package ca.mcgill.ecse202.a5;

import java.util.Scanner;

public class Question3 {

  public static void method(int[] array){
    try{
      System.out.println("Enter and index of the list:");
      Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      System.out.println(array[x]+" is the int at index "+x);
      input.close();
      
    }  catch (Exception IndexOutOfBoundsException){
      System.out.println("Index out of bounds");
      Question3.method(array);
      
    }
    
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] array = new int[100];
    for (int i = 0;i<array.length;i++){
      double y= (Math.random()*100000);
      //System.out.println((int)y);
      array[i] = (int)(y);
      
    }
    //System.out.println(array[11]);
    
    try {
      Question3.method(array);
      
    } catch (Exception IndexOutOfBoundsException){
      System.out.println("Index out of bounds");
      
    }
    

  }

  }


