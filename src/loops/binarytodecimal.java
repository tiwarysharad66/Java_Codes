package loops;

import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int binary = s.nextInt();
        System.out.println(binarycon(binary));

    }

    public static int binarycon(int bin) {
        int dec = 0;
        int pow2 = 0;
        while (bin > 0) {
            dec = (int) (dec + (bin % 10) * Math.pow(2, pow2));
            pow2++;
            bin = bin / 10;
        }
        return dec;
    }
}