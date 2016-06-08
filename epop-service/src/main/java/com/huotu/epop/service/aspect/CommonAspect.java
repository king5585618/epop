/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.service.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by jinzj on 2016/6/8.
 */
@Aspect
public class CommonAspect {

    private Log log = LogFactory.getLog(CommonAspect.class);

    @Pointcut("execution(* com.huotu.epop.service.service..*.*(..))")
    public void pointCutMethod(){

    }

    //声明环绕通知
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.nanoTime();
        Object o = pjp.proceed();
        long end = System.nanoTime();
        log.debug(pjp.getTarget().getClass()+"."+pjp.getSignature().getName()+":"+(end-begin)/1000000);
        return o;
    }
}
