package loops;

import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rev = 0;
        while(num>0) {
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
