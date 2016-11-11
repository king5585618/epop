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
 * Created by jinzj on 2016/9/21.
 */
public class Test2 {

    float a[] = {};
    float b[] = new float[2];

    public static void a() {
        class C {

        }
    }

    public static void main(String[] args) {
        class A {
            int a = 1;
        }
        Object o = new A();
        A a = (A) o;
        System.out.println(a.a);
    }

    static class C {
        static int i = 0;
    }

    class B {
        int a = 1;
    }
}
