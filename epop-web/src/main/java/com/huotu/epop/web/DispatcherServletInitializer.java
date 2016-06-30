/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.web;

import com.huotu.epop.service.ServiceConfig;
import com.huotu.epop.web.config.CoreConfig;
import com.huotu.epop.web.config.DataSourceConfig;
import com.huotu.epop.web.config.LoggingConfig;
import com.huotu.epop.web.config.MVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by jinzj on 2016/6/1.
 */
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                CoreConfig.class, MVCConfig.class, LoggingConfig.class,
                ServiceConfig.class, DataSourceConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
