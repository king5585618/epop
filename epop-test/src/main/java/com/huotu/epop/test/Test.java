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
 * Created by jinzj on 2016/7/13.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        int[] a = {1, -1, 0, 2, -3, -2, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = j; k < a.length; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(a[i] + ":" + a[j] + ":" + a[k]);
                    }
                }
            }
        }
    }
}
