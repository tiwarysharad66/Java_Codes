package condtional;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        switch(number){
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6: System.out.println("saturday");
            break;
            case 7: System.out.println("sunday");
            break;
            default:
                System.out.println("you have entered wronggggggggggg!!!!!!!!!!");
        }
    }
}
