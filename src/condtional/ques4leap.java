package condtional;

import java.util.Scanner;

public class ques4leap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if(year%4!=0){
            System.out.println("not leap");
        }
        else if(year%100!=0){
            System.out.println("leap");
        }
        else if(year%400!=0){
            System.out.println("not a leap year");
        }

    }
}
