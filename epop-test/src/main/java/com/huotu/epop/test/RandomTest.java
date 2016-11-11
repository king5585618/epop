/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.test;

import org.apache.http.annotation.ThreadSafe;

import java.util.Random;

/**
 * Created by jin on 2016/11/9.
 */
@ThreadSafe
public class RandomTest {

    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(2));
        }

    }
}
