package com.gla.Leetcode_Problems;
//A Number After a Double Reversal
public class LC2119 {
    class Solution {
        public boolean isSameAfterReversals(int num) {
            if (num==0) return true;
            return (num%10!=0);
        }
    }
}
