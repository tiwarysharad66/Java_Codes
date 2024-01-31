package loops;
import java.util.Scanner;
import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = s.nextInt();
      boolean f =   prime(n);
       if(f==true){
           System.out.println("the entered number is a prime number");
       }
       else{
           System.out.println("the entered number was'nt a prime number");
       }
    }

    public static boolean prime(int n) {
        if(n==2 || n==1){
            return true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}





