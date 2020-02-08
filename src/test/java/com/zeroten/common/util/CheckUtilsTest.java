package com.zeroten.common.util;

import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void isAnyEmptyTest(){
        //如果 strings 中有任意1个字符串为空,则返回 true,否则返回 false
        System.out.println(CheckUtils.isAnyEmpty());
        System.out.println(CheckUtils.isAnyEmpty(null));
        System.out.println(CheckUtils.isAnyEmpty(""));
        System.out.println(CheckUtils.isAnyEmpty("1",null,"2"));
        System.out.println(CheckUtils.isAnyEmpty("1","","2"));
        System.out.println(CheckUtils.isAnyEmpty("1","2","3"));
    }

    @Test
    public void isEmptyTest(){
        //判断引用类型数组是否为空,为空或 null 则返回 true,否则返回 false
        Object[] emptyArr = {};
        String[] strArr1 = {""};
        String[] strArr2 = {null};
        String[] strArr3 = {"1"};
        System.out.println(CheckUtils.isEmpty(null));
        System.out.println(CheckUtils.isEmpty(emptyArr));
        System.out.println(CheckUtils.isEmpty(strArr1));
        System.out.println(CheckUtils.isEmpty(strArr2));
        System.out.println(CheckUtils.isEmpty(strArr3));
    }

    @Test
    public void stringEqualsTest(){
        //判断 str1 字符串是否相等,相等则返回 true,否则返回 false.
        //当其中1个是 null 时返回false.
        System.out.println(CheckUtils.stringEquals(null,null));
        System.out.println(CheckUtils.stringEquals(null,""));
        System.out.println(CheckUtils.stringEquals("",null));
        System.out.println(CheckUtils.stringEquals("",""));
        System.out.println(CheckUtils.stringEquals("","1"));
        System.out.println(CheckUtils.stringEquals("1","1"));
        System.out.println(CheckUtils.stringEquals("1","2"));
    }

    @Test
    public void integerEqualsTest(){
        //判断 n1 和 n2 的值是否相等,相等则返回 true,否则返回 false.
        //当其中1个是 null 时返回false.
        System.out.println(CheckUtils.integerEquals(null,null));
        System.out.println(CheckUtils.integerEquals(null,1));
        System.out.println(CheckUtils.integerEquals(1,null));
        System.out.println(CheckUtils.integerEquals(1,1));
        System.out.println(CheckUtils.integerEquals(1,2));
    }


}
