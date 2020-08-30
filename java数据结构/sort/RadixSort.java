package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class RadixSort{

    public static void main(String[] args) {
        int arr[] = { 53, 3, 542, 748, 14, 214};

        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        radixSort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序前的时间是=" + date2Str);

        System.out.println("基数排序后 " + Arrays.toString(arr));

    }

    // 基数排序方法
    public static void radixSort(int[] arr) {

        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 最大位数，决定了几次循环
        int maxLength = (max + "").length();
        // 因为不知道每个桶会放几个，所以按照最坏的情况，都放在一个桶里安排长度
        int[][] bucket = new int[10][arr.length];
        // 建一个一位数组来存放每个桶里数据的个数
        //bucketElementCount[0]放置的就是bucket[0]桶里数据的个数
        int[] bucketElementCounts = new int[10];

        for(int i = 0 , n = 1; i < maxLength; i++, n *= 10) {
            for(int j = 0; j < arr.length; j++) {

                //判断个、十、百。。。位
                int digitOfElement = arr[j] / n % 10;
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }
            int index = 0;

            //把桶里的数字取出放入array
            for(int k = 0; k < bucketElementCounts.length; k++) {
                if(bucketElementCounts[k] != 0) { //表明该位置上有数字，需遍历
                    for(int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index++] = bucket[k][l];
                    }
                }

                //取出数字，清零

                bucketElementCounts[k] = 0;

            }

        }
    }
}