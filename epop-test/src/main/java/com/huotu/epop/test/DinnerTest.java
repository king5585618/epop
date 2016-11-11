/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by jin on 2016/11/7.
 */
public class DinnerTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("十面埋伏", "雄来饭", "老北京炸酱面", "手擀面", "中华牛肉面", "沙县", "麻辣烫", "一口田"
                , "一口田旁边的面", "食堂");
        Random random = new Random();
        System.out.println(list.get(random.nextInt(list.size() - 1)));

    }
}
