package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T03;

import java.util.Stack;

/**
 * @author xuhu
 * @date 2021-01-05 22:06
 * 编程模拟实现一个浏览器的前进、后退功能
 * 在浏览器中 如依次访问 ABCD 不访问新页面，是可以来回切换的，
 * 但如果在切换的过程中，从B view了 另外一个页面 则不可前进了
 * 具体效果可以结合代码和浏览器实现原理探索
 */
public class Browser {

    private Stack<String> stack1;
    private Stack<String> stack2;

    public Browser(){
        stack1 = new Stack<> ();
        stack2 = new Stack<> ();
    }

    public void viewPage(String url){
        stack1.add(url);
        if (!stack2.isEmpty()){
            stack2 = new Stack<> ();
        }
    }
    public String now(){
        if (!stack1.isEmpty()){
            return stack1.peek();
        }else {
            return "null!";
        }
    }

    public String before(){
        if (stack1.isEmpty()){
            return "不可before";
        }
        String url = stack1.pop();
        stack2.push(url);
        return this.now();
    }

    public String after() {
        if (stack2.isEmpty()){
            return "不可after";
        }
        String url = stack2.pop();
        stack1.push(url);
        return url;
    }

}
