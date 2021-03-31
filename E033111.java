package easy;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
public class E033111 {
    class Solution {
        public int[] exchange(int[] nums) {
            int[] result=new int[nums.length];
            int left=0;int right=nums.length-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2==1){
                    result[left]=nums[i];
                    left++;
                }else{
                    result[right]=nums[i];
                    right--;
                }
            }
            return result;
        }
    }
}
