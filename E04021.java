package easy;
//小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
//        如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
//        请你计算 最多 能喝到多少瓶酒
public class E04021 {
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int emptyBottles = numBottles;
            while(emptyBottles >= numExchange){
                numBottles += emptyBottles/numExchange;
                emptyBottles = emptyBottles/numExchange + emptyBottles%numExchange;
            }
            return numBottles;
        }
    }
}
