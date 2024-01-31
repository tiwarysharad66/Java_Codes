package leetcode;

public class Sort_Zeroes {
    public static void main(String[] args) {
int arr[] = {0,1,0,3,12};
Sort(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
    public static void Sort(int[]nums){
        int counter = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[counter]= nums[i];
                nums[i]=0;
                counter++;
            }
        }
//        for(int j=0;j<nums.length;j++){
//            if(nums[j]==0){
//                nums[j]=0;
//            }
//        }

    }
}
//class Solution {
//    public void moveZeroes(int[] nums) {
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0){
//                arr.add(nums[i]);
//            }
//        }
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==0){
//                arr.add(nums[i]);
//            }
//        }
//        for(int i=0;i<nums.length;i++ ){
//            nums[i] = arr.get(i);
//        }
//    }
