package loops;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        BigInteger fact = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
           fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
