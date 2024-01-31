package condtional;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner s  =new Scanner(System.in);
        double temp = s.nextInt();
        if(temp>100){
            System.out.println("fever");
        }
        else{
            System.out.println("no fever");
        }

    }
}
