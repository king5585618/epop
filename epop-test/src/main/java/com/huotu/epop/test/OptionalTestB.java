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
 * Created by jinzj on 2016/10/8.
 */
public class OptionalTestB {
    public static void main(String[] args) {
//        Optional<String> optional = Optional.of("1111111");
//        optional.ifPresent(s -> System.out.println(s));
//        System.out.println(optional.orElse(null));
        OptionalTest test = new OptionalTest();
        OptionalTest.A a = test.new A();
        a.a();
    }
}
