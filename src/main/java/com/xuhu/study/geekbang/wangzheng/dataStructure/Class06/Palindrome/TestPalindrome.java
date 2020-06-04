package com.xuhu.study.geekbang.wangzheng.dataStructure.Class06.Palindrome;

import com.xuhu.study.Utils.ListNodeUtil;

/**
 * @author xuhu
 * @date 2020-06-04 9:33
 */
public class TestPalindrome {

    public static void main(String[] args) {
//        System.out.println(Palindrome.isPalindrome(ListNodeUtil.createListNode("1211".chars().mapToObj(c -> (char)c).toArray(Character[]::new))));
        System.out.println(Palindrome.isPalindromeStack(ListNodeUtil.createListNode("112211".chars().mapToObj(c -> (char)c).toArray(Character[]::new))));
        System.out.println(Palindrome.isPalindromeStack(ListNodeUtil.createListNode("1111".chars().mapToObj(c -> (char)c).toArray(Character[]::new))));
        System.out.println(Palindrome.isPalindromeStack(ListNodeUtil.createListNode("11211".chars().mapToObj(c -> (char)c).toArray(Character[]::new))));
        System.out.println(Palindrome.isPalindromeStack(ListNodeUtil.createListNode("1211".chars().mapToObj(c -> (char)c).toArray(Character[]::new))));
        System.out.println(Palindrome.isPalindromeStack(ListNodeUtil.createListNode("1122112211".chars().mapToObj(c -> (char)c).toArray(Character[]::new))));

    }

}
