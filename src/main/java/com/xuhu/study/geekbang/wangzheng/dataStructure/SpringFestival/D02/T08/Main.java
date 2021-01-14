package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T08;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("(){}[]"));
        System.out.println(solution.isValid("{[()]}"));
    }
}