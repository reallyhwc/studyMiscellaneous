package com.xuhu.study.geekbang.wangzheng.dataStructure.Class08;

import com.xuhu.study.Utils.SystemOutUtil;

/**
 * @author xuhu
 * @date 2020-06-05 17:24
 */
public class Main {

    public static void main(String[] args) {
//        System.out.println(Test.matchStr("{}{}{}{}{}{}{}{[()]}"));
        System.out.println(Test.matchStr("{[]()[{}]}"));
        System.out.println(Test.matchStr("[{()}([])]"));
        System.out.println(Test.matchStr("{[}()]"));
        System.out.println(Test.matchStr("[({)]"));
    }
}
