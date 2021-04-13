package easy;
//给你一个按 YYYY-MM-DD 格式表示日期的字符串 date，请你计算并返回该日期是当年的第几天。
//        通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
public class E0413 {
    class Solution {
        public int dayOfYear(String date) {
            int sum=0;
            int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
            String[] strs = date.split("-");
            int year = Integer.valueOf(strs[0]).intValue();
            int month = Integer.valueOf(strs[1]).intValue();
            int day = Integer.valueOf(strs[2]).intValue();
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                month[1]=29;
            }
            for(int i=0;i<month-1;i++){
                sum+=month[i];
            }
            return sum+day;
        }
    }
}
