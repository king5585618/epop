/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.test;

import java.math.BigDecimal;

/**
 * Created by jinzj on 2016/7/1.
 */
public class briberyMoneyRandom {

    public static void main(String[] args) {
        double total = 100;
        double min = 0.01;
        int num = 10;
        for (int i = 1; i < num; i++) {
            double safeMoney = (total - (num - i) * min) / (num - i);
            BigDecimal bg = new BigDecimal(Math.random() * (safeMoney - min) + min);
            double money = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() < min ?
                    min : bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            BigDecimal bg2 = new BigDecimal(total - money);
            total = bg2.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println("第" + i + "个红包：" + money + "，余额：" + total);
        }
        System.out.println("第" + num + "个红包：" + total + "，余额：" + 0);
    }
}
