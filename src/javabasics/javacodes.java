package javabasics;

import java.util.Scanner;

public class javacodes {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int a  = s.nextInt();
      int b = s.nextInt();
      int  c = s.nextInt();
      int sum = a+b+c;
      float avg =  sum/3f;
      System.out.println(avg);
    }

}
