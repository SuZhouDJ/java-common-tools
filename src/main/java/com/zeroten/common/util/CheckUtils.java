package com.zeroten.common.util;

public class CheckUtils {
    //如果 strings 中有任意1个字符串为空,则返回 true,否则返回 false
    public static boolean isAnyEmpty(String... strings){
        boolean flag = false;
        if(strings == null || strings.length == 0){
            flag = true;
        }
        else{
            for(String s: strings){
                if(s == null || s == ""){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
    //判断引用类型数组是否为空,为空或 null 则返回 true,否则返回 false
    public static boolean isEmpty(Object[] arr){
        if(arr == null || arr.length == 0){
            return true;
        }
        return false;
    }
    //判断 str1 字符串是否相等,相等则返回 true,否则返回 false.
    //当其中1个是 null 时返回false.
    public static boolean stringEquals(String str1, String str2){
        if(str1 != null && str2 != null){
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }

    //判断 n1 和 n2 的值是否相等,相等则返回 true,否则返回 false.
    //当其中1个是 null 时返回false.
    public static boolean integerEquals(Integer n1, Integer n2){
        if(n1 != null && n2 != null){
            if(n1.intValue() == n2.intValue()){
                return true;
            }
        }
        return false;
    }
}
