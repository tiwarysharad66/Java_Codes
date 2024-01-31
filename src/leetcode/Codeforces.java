package leetcode;
import java.util.Arrays;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Codeforces {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        String stringArray[] = new String[n];
        for(int j=0;j<stringArray.length;j++){
            stringArray[j] = s.nextLine();
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < stringArray.length; i++) {
            sb.append(stringArray[i]);
        }
        String str = Arrays.toString(stringArray);
        System.out.println(str);

    }

}

