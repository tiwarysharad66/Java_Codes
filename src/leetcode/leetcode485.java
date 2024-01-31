package leetcode;

public class leetcode485 {
    public static void main(String[] args) {
int arr[] = {1,1,0,1,1,1};
        System.out.println(max(arr));
    }
    public static int max(int[]nums){
int n = nums.length;
int count= 0;
int maxcount =Integer.MIN_VALUE;
for(int i=0;i<n;i++){
if(nums[i]==1){
    count++;
}
else{
    count=0;
}
maxcount = Math.max(count,maxcount);
}
return maxcount;
    }
}
