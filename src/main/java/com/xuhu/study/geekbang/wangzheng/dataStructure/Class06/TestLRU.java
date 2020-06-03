package com.xuhu.study.geekbang.wangzheng.dataStructure.Class06;

/**
 * @author xuhu
 * @date 2020-06-03 8:51
 */
public class TestLRU {
    public static void main(String[] args) {
        testLRUCache01_01();
        System.out.println("\n------------------------\n");
        testLRUCache01_02();
        System.out.println("\n------------------------\n");
        testLRUCache01_03();
        System.out.println("\n------------------------\n");
        testLRUCache01_04();
    }

    public static void testLRUCache01_01(){
        LRUCache01 cache01 = new LRUCache01(5);
        cache01.put(1,11);
        cache01.put(2,12);
        cache01.put(3,13);
        cache01.put(4,14);
        cache01.put(5,15);
        cache01.put(6,16);
        cache01.put(7,17);
        System.out.println(cache01.get(1));
        System.out.println(cache01.get(2));
        System.out.println(cache01.get(7));
        cache01.put(1,21);
        cache01.put(2,22);
        cache01.put(3,23);
        cache01.put(4,24);
        System.out.println(cache01.get(7));
        System.out.println(cache01.get(1));
        System.out.println(cache01.get(2));
        System.out.println(cache01.get(3));
        System.out.println(cache01.get(4));
    }

    public static void testLRUCache01_02(){
        LRUCache01 cache = new LRUCache01( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));      // 返回  1
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        System.out.println(cache.get(3));       // 返回  3
        System.out.println(cache.get(4));       // 返回  4
    }

    public static void testLRUCache01_03(){
        LRUCache01 cache = new LRUCache01( 1 /* 缓存容量 */ );

        cache.put(2, 1);
        System.out.println(cache.get(2));      // 返回  1
        cache.put(3, 2);    // 该操作会使得关键字 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        System.out.println(cache.get(3));       // 返回 2
    }

    public static void testLRUCache01_04(){
        LRUCache01 cache = new LRUCache01( 2 /* 缓存容量 */ );


        System.out.println(cache.get(2));      // 返回  -1
        cache.put(2, 6);
        System.out.println(cache.get(1));      // 返回  -1
        cache.put(1, 5);
        cache.put(1, 2);
        System.out.println(cache.get(1));       // 返回 2
        System.out.println(cache.get(2));       // 返回 6
    }


}
