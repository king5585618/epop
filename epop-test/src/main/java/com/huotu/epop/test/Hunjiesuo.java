/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.test;

import java.lang.reflect.Proxy;

/**
 * Created by administrator on 2016/9/13.
 */
public class Hunjiesuo {

    public static void main(String args[]) {

        ZhangsanService service = new ZhangsanServiceImpl();
        ZhangsanService proxy = (ZhangsanService) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces()
                , new ReadyInvocationHandler(service));
        proxy.xiangqin();
    }
}
