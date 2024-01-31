package functionsques;

import java.util.Scanner;

public class firstques {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(avg(a, b, c));
    }

    public static int avg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }
}
