package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T02;

/**
 * @author xuhu
 * @date 2020-12-21 20:06
 * 实现一个大小固定的有序数组，支持动态增删改操作
 */
public class Array {
    private String[] data;
    private int count;
    private int size;

    public Array(int capacity) {
        data = new String[capacity];
        count = 0;
        size = capacity;
    }

    public boolean insert(int index, String value) {
        if (count >= size) {
            return false;
        }
        if (index < 0 || index > count) {
            return false;
        }
        for (int i = count - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        count++;
        return true;
    }

    public String delete(int index, String value) {
        if (count == 0) {
            throw new RuntimeException("空数组不可删除");
        }
        if (index < 0 || index > count) {
            throw new RuntimeException("待删除数据位置不正确！");
        }
        value = data[index];
        for (int i = index; i <= count - 1; i++) {
            data[i - 1] = data[i];
        }
        count--;
        return value;
    }
}