package functionsques;

public class sumofdigit {
    public static void main(String[] args) {
        System.out.println(sumofdigit2(234));
    }
    public static int sumofdigit2(int a){
        int sum =0;
        while(a>0){
            sum+= a%10;
            a = a/10;
        } 
        return sum;
    }
}
