package easy;
//给你一个正整数组成的数组 nums ，返回 nums 中一个 升序 子数组的最大可能元素和。
//        子数组是数组中的一个连续数字序列。
//        已知子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，若对所有 i（l <= i < r），numsi < numsi+1 都成立，则称这一子数组为 升序 子数组。注意，大小为 1 的子数组也视作 升序 子数组

public class E0512双指针 {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int left=0;
            int right=1;
            int len=nums.length;
            int count=nums[left];
            int max=count;
            while(right<len){
                if(nums[right]>nums[left]){
                    count+=nums[right];
                }else{
                    count=nums[right];
                }
                if(max<count){
                    max=count;
                }
                left++;
                right++;
            }
            return max;
        }
    }
}
