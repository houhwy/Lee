package easy;
//给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
//
//        请你计算并返回该式的最大值。
import java.util.Arrays;

public class E0409 {
    class Solution {
        public int maxProduct(int[] nums) {
            Arrays.sort(nums);
            int a=nums.length;
            return(nums[a-1]-1)*(nums[a-2]-1);

        }
    }
}
