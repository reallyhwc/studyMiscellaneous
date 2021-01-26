package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T09;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.longestValidParentheses("(()"));
        System.out.println(solution.longestValidParentheses(")()())"));
        System.out.println(solution.longestValidParentheses(""));
        System.out.println(solution.longestValidParentheses("()(())"));
        System.out.println(solution.longestValidParentheses("(()())"));
    }
}