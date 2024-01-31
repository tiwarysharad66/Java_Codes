package leetcode;

public class Leetcode26 {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
int x =remove(nums);
        System.out.println(x);
    }
    public static int remove(int []nums) {
        int counter =0 ;
        for(int j =1;j<nums.length;j++){
            if(nums[counter]!=nums[j]){
                counter++;
                nums[counter] = nums[j];

            }
        }
        return counter+1;
    }
    }
//        int counter =0 ;
//        for(int i =0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1]){
//                nums[counter] = nums[i];
//                counter++;
//            }
//        }
//        return counter; this approach correct but leetcode format error for this question
//    }
