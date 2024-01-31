package functionsques;

public class thirdques {
    public static void main(String[] args) {
        System.out.println(palin(121));
    }

    public static boolean palin(int n) {
        int temp = n;
        int rev =0;
        while(n>0){
            rev = (rev*10)+n%10;
            n = n/10;
        }
        if (rev == temp) {
            return true;
        }
        return false;
    }

}
