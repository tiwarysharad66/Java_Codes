package leetcode;

public class leetcode136 {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 1, 2};
        int singleelement = single(arr);
        System.out.println(singleelement);
        System.out.println(single2(arr));
    }

    public static int single2(int[] arr) {
        int ans = 0;
        for (int x : arr) {
            ans ^= x;
        }
        return ans;

    }

    public static int single(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return 0;
        //this was brute force approach;
    }
}


