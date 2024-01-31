package leetcode;

import java.util.Arrays;

public class leetcode169_optimise {
    public static void main(String[] args) {
int []arr = {2,2,1,1,1,2,2};
        System.out.println(maj(arr));
    }
    public static int maj(int[]arr){
        int n  = arr.length;
        Arrays.sort(arr);
      return arr[n/2];
    }
}
