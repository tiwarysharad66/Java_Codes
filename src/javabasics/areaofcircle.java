package javabasics;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float radius = s.nextFloat();
        float area = (3.14f)*(radius*radius);
        System.out.println(area);
        long a =10000000000000000L;
        int  c = (int)a  ;
        System.out.println(c);
    }
}
