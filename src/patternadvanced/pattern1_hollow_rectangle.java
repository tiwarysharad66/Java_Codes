package patternadvanced;

import java.util.Scanner;

public class pattern1_hollow_rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1|| j==1||i==rows||j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
