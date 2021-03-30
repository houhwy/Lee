package middle;

//传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
//
//        传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
//
//        返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。

public class M03302 {
    class Solution {
        public int shipWithinDays(int[] weights, int D) {
            int sum=0;
            int max=0;
            int con=0;
            int result=0;
            for(int i=0;i<weights.length;i++){
                sum+=weights[i];
                max=Math.max(max,weights[i]);
            }
            int min=Math.max(sum/D,max);
            while(result!=D){
                for(int i=0;i<weights.length;i++){
                    if(con>=min){
                        con=0;
                        i-=1;
                        result++;
                    }
                    con+=weights[i] ;
                }
                min++;
            }
            return min;
        }
    }
}

