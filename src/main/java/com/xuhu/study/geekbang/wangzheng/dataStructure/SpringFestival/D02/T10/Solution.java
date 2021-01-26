package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T10;


import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    List list = Arrays.asList("+", "-", "*", "/");

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!list.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculateNum(a,b,token));
            }
        }
        return stack.pop();
    }

    private int calculateNum(int a, int b, String token) {
        if (token.equals(list.get(0))) {
            return a + b;
        }
        if (token.equals(list.get(1))) {
            return a - b;
        }
        if (token.equals(list.get(2))) {
            return a * b;
        }
        return a / b;
    }
}