package easy;
//编写一个程序判断给定的数是否为丑数。
//
//        丑数就是只包含质因数 2, 3, 5 的正整数。
public class E03313 {
    class Solution {
        public boolean isUgly(int n) {
            if(n>=1){
                while(n%5==0)n/=5;
                while(n%3==0)n/=3;
                while(n%2==0)n/=2;
                if(n==1){
                    return true;
                }
            }
            return false;
        }
    }
}
