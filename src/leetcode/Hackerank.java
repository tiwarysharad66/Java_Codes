package leetcode;

import java.util.Scanner;

public class Hackerank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
for(int i=0;i<arr.length;i++){
    arr[i] = s.nextInt();
}
arrange(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void arrange(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            if( i-1>=0 && arr[i]<arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if (i+1< arr.length &&arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
    }
}
