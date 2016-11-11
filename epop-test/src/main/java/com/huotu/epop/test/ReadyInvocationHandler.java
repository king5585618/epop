/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by administrator on 2016/9/13.
 */
public class ReadyInvocationHandler implements InvocationHandler {

    private Object zhangsan = null;

    public ReadyInvocationHandler(Object zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println(proxy.getClass().getSimpleName());
        System.out.println("打扮好再去");
        result = method.invoke(zhangsan, args);
        return result;
    }
}
