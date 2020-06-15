package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T09;

/**
 * @author xuhu
 * @date 2020-06-15 11:01
 * 尝试桶排序
 */
public class BucketSorting {

    /**
     *  桶排序
     * @param arrays 桶排序待排数组
     * @param maxNum 桶排序中定义的桶的最大值
     * @param bucketNum 桶排序中 定义的桶的个数
     * @return 排序好的数组
     */
    public static int[] sort(int[] arrays, int maxNum, int bucketNum){
        // 统计每个桶的容量大小
        int[] bucketSize = new int[bucketNum];
        int[][] buckets = new int[bucketNum][arrays.length];
        int tempMaxNum = (maxNum) / bucketNum;
        for(int i = 0; i < arrays.length; i++){
            int num = arrays[i];
            for(int j = 1; j <= bucketNum; j++){
                if(num <= (tempMaxNum * j)){
                    // 存入某个指定的桶中
                    buckets[j-1][bucketSize[j-1]] = num;
                    // 桶容量+1
                    bucketSize[j-1]++;
                    break;
                }
            }
        }

        // 桶内排序
        for(int i = 0; i < bucketNum; i++){
            fastSort(buckets[i],0,bucketSize[i]-1);
        }
        int index = 0;
        for(int i = 0; i < bucketNum; i++){
            for(int j = 0; j < bucketSize[i]; j++){
                arrays[index] = buckets[i][j];
                index++;
            }
        }

        return arrays;
    }



    // 这里直接把快排掏过来 - 桶内排序用快排
    private static void fastSort(int[] arrays, int begin, int end){
        if(begin > end)return;
        int p = partition(arrays,begin,end);
        fastSort(arrays,begin,p-1);
        fastSort(arrays,p+1,end);
    }

    private static int partition(int[] arrays, int begin, int end){

        int pivot = arrays[end];
        int i = begin;
        for(int j = begin; j < end; j++){
            if(arrays[j] < pivot){
                swap(arrays,i,j);
                i++;
            }
        }
        swap(arrays,i,end);
        return i;
    }

    private static void swap(int[] arrays, int i, int j){
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
}
