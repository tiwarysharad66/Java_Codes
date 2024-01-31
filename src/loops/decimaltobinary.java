package loops;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(decimal(n));
    }
    public static int decimal(int num){
        int bin = 0;
        int pow = 0;
        while(num>0){
             bin = bin+ num%2*(int)Math.pow(10,pow);
             pow++;
             num = num/2;
        }
        return bin;
    }
}

