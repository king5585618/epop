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
 * Created by administrator on 2016/9/20.
 */
public class A {

    int i = 1;

    public A() {
        Thread thread = new Thread() {
            public void run() {
                for (; ; ) {
                    A.this.run();
                    try {
                        sleep(1000);
                    } catch (InterruptedException ie) {
                    }

                }
            }
        }; //注意这里有;
        thread.start();
    }

    public static void main(String[] args) throws Exception {
        new A();
    }

    public void run() {
        System.out.println("i = " + i);
        i++;
    }

}
