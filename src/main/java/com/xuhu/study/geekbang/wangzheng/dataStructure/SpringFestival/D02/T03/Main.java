package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T03;

/**
 * @author xuhu
 * @date 2021-01-05 22:13
 */
public class Main {

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.viewPage("A");
        browser.viewPage("B");
        browser.viewPage("C");
        browser.viewPage("D");
        System.out.println(browser.before());
        System.out.println(browser.before());
        System.out.println(browser.before());
        System.out.println(browser.after());
        System.out.println(browser.after());
        System.out.println(browser.before());
        browser.viewPage("G");
        System.out.println(browser.after());
        System.out.println(browser.before());
        System.out.println(browser.before());
        System.out.println(browser.before());
        System.out.println(browser.before());
    }
}
