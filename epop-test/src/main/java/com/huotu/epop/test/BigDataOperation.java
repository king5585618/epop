/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.test;


/**
 * Created by jinzj on 2016/6/7.
 * 两个越界数据进行运算
 */
public class BigDataOperation {

    public static String calculatedValue(String str1, int len1, String str2, int len2) {
        int allLen = len1 + len2 - 1;
        int[] a = new int[allLen];
        char[] b = str1.toCharArray();
        char[] c = str2.toCharArray();
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                a[i + j] += Integer.parseInt(String.valueOf(b[i])) * Integer.parseInt(String.valueOf(c[j]));
            }
        }
        for (int k = allLen - 1; k >= 0; k--) {
            if (k > 0) {
                int result = a[k] / 10;
                if (result == 0)
                    continue;
                int lastNum = a[k] % 10;
                a[k] = lastNum;
                a[k - 1] += result;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < allLen; i++) {
            builder.append(a[i]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {

        String str1 = "23456789009877666555544444";
        String str2 = "346587436598437594375943875943875";
        int length1 = str1.length();
        int length2 = str2.length();
        System.out.println(calculatedValue(str1, length1, str2, length2));
    }
}
