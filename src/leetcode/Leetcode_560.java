package leetcode;

public class Leetcode_560 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(count(nums,2));
    }
    public static int count(int nums[],int k){
        int count = 0;
        int n = nums.length;
        int currentsum = 0;
        int[]prefixsum = new int[n];
        prefixsum[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixsum[i] = nums[i]+prefixsum[i-1];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==0){
                    currentsum = prefixsum[j];
                    if(currentsum==k){
                        count++;
                    }
                }
                else{
                    currentsum= prefixsum[j]-prefixsum[i-1];
                    if(currentsum==k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
