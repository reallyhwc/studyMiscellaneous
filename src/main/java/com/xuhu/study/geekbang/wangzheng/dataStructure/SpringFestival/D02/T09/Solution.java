package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T09;


class Solution {
    /**
     * 非常标准的DP做法，细则及动态转换方程，需要自己看代码理解，也可以画个图梳理一下
     * @param s s
     * @return num
     */
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int maxLength = 0;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (chars[i - 1] == '(') {
                    // ...()
                    dp[i] = 2 + (i - 2 >= 0 ? dp[i - 2] : 0);
                }else {
                    // ....))
                    if (dp[i-1] > 0){
                        // ..(..))
                        if ((i - dp[i-1] - 1) >= 0 && chars[i - dp[i-1] - 1] == '('){
                            // ..((..))
                            dp[i] = 2 + dp[i-1] + ((i - dp[i-1] - 2) > 0 ? dp[i - dp[i-1] - 2] : 0);
                        }
                    }
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }
}