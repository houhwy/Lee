package easy;

public class E0480双指针 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if(nums==null || nums.length == 1){
                return nums.length;
            }
            int i = 0,j =1;
            while(j<nums.length){
                if(nums[i]==nums[j]){
                    j++;
                }else{
                    i++;
                    nums[i]=nums[j];
                    j++;
                }
            }
            return i+1;
        }
    }
}
