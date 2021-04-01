package easy;
//给你一个二进制字符串 s ，该字符串 不含前导零 。
//
//        如果 s 最多包含 一个由连续的 '1' 组成的字段 ，返回 true​​​ 。否则，返回 false 。
public class E04011 {
    class Solution {
        public boolean checkOnesSegment(String s) {
            int first=s.indexOf('1');
            int last=s.lastIndexOf('1');
            return !s.substring(first,last).contains("0");
        }
    }
}
