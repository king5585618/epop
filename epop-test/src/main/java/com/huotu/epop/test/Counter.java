/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jin on 2016/10/18.
 */
public class Counter {
    //    public AtomicInteger count=new AtomicInteger(0);
    public volatile Integer count = 0;
    Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        Counter counter = new Counter();
//        System.out.println("运行结果:Counter.count=" + counter.count);
//        counter.map.put("userCount",0);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                counter.inc();
            }).start();
        }

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("运行结果:Counter.count=" + counter.count);
    }

    public void inc() {
        //
//        count=count+1;
//        count = map.get("userCount");
//        if(null==count)
//            count=0;
        map.putIfAbsent("userCount", 0);
        synchronized (map.get("userCount")) {
//            int count = map.get("userCount");
            for (int i = 0; i < 100000; i++) {
                count = count + 1;
            }
//            count=count+1;
            map.put("userCount", count);
            System.out.println(count);
        }
//        System.out.println(count);
//        System.out.println(count);
//        int a = count.get()+1;
//        count.set(a);
        //
    }
}
