package easy;

public class E0408字符双指针 {
    class Solution {
        public int minimumLength(String s) {
            char[] ans=s.toCharArray();
            int len=s.length();
            int left=0;int right=len-1;
            while(left<right){
                if(ans[left]==ans[right]){
                    if(left+1==right)return 0;
                    else
                    {while(left<right){
                        if(ans[left]==ans[left+1]){
                            left++;
                            if(left==right)return 0;
                        }else if(ans[right]==ans[right-1]){
                            right--;
                            if(left==right)return 1;
                        }
                    }
                    }
                }
                else break;
            }
            return right-left+1;
        }
    }
}
