package com.zeroten.common.util;


import java.util.Arrays;

public class ArrayUtils {
    //对传⼊的 int 数组进⾏排序,从⼩到⼤,并返回排序后的结果
    public static int[] sort(int[] arr){
        if(arr != null){
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-1-i; j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        return arr;
    }

}
