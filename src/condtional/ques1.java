package condtional;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num>=0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
    }
}
