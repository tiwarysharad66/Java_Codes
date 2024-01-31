package javabasics;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        /*
        code with comments are
        multilines comments
        hello
        world

         */
        Scanner s = new Scanner(System.in);
        float c1 = s.nextFloat();
        float c2 = s.nextFloat();
        float c3 = s.nextFloat();
        float gst = (c1+c2+c3)+0.18f;
        System.out.println(gst);

    }
}
