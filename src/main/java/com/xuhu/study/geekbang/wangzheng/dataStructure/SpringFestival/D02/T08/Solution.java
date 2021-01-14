package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T08;


import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character> ();
        for (char c : s.toCharArray()){
            switch (c){
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    continue;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else {
                        return false;
                    }
                    continue;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else {
                        return false;
                    }
                    continue;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }else {
                        return false;
                    }
                    continue;
                default:
            }

        }
        return stack.isEmpty();
    }
}