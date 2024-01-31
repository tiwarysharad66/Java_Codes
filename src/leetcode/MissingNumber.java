package leetcode;
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
int arr[] = {3,0,1};
        System.out.println(missing(arr));
    }
    public static int missing(int[]nums){
        //my approach 6ms runtime
int n = nums.length;
int arr[] = new int[n];
for(int i=0;i<n;i++){
    arr[i] = i;
}
Arrays.sort(nums);
for(int i=0;i<n;i++){
    if(arr[i]!=nums[i]){
        return arr[i];
    }
}
        if(n==1||n==0){
            return 1;
        }

        return nums[n-1]+1;
    }
    }
// 0ms

//    public static int missing(int[]nums) {
//        int sum = 0;
//        int n = nums.length;
//        int nsum = n * (n + 1) / 2;
//        for (int i = 0; i < n; i++) {
//            sum += nums[i];
//        }
//        return nsum-sum;
//    }
//1ms time complexity
//without taking array as a input take 1 pointer of i and increament in the loop itself and match the element with that pointer value;
