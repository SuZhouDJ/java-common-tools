package com.zeroten.common.util;


import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayUtilsTest {
    @Test
    public void sortTest(){
        System.out.println(Arrays.toString(ArrayUtils.sort(null)));
        System.out.println(Arrays.toString(ArrayUtils.sort(new int[]{})));
        System.out.println(Arrays.toString(ArrayUtils.sort(new int[]{87,354,2,8,34,1,-42,9})));
        System.out.println(Arrays.toString(ArrayUtils.sort(new int[]{65,-9,1,82,54,-11,-49,5})));
        System.out.println(Arrays.toString(ArrayUtils.sort(new int[]{232,45,-2,32,879,4,-768,-9})));
    }
}
