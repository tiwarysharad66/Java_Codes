package leetcode;
import java.util.*;
public class kthlargestelementofarray {
    public static void main(String[] args) {
//solve this by priority queues;
    }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int klargest = nums[n - k];
        return klargest;
    }
}
