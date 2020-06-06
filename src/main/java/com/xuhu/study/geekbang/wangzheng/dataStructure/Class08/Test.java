package com.xuhu.study.geekbang.wangzheng.dataStructure.Class08;

import java.util.Stack;

/**
 * @author xuhu
 * @date 2020-06-05 17:23
 * 利用栈来检查表达式中的字符串是否匹配
 * 我们同样简化一下背景。我们假设表达式中只包含三种括号，圆括号 ()、方括号[]和花括号{}，
 * 并且它们可以任意嵌套。比如，{[] ()[{}]}或[{()}([])]等都为合法格式，
 * 而{[}()]或[({)]为不合法的格式。那我现在给你一个包含三种括号的表达式字符串，如何检查它是否合法呢？
 */
public class Test {

    public static boolean matchStr(String str){
        if(str == null || str.length() == 0) return true;
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < chars.length; i++){
            switch (chars[i]){
                case '{':
                case '[':
                case '(':
                    stack.push(chars[i]);
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}
