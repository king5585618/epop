package com.huotu.epop.web;

import com.huotu.epop.service.ServiceConfig;
import com.huotu.epop.web.config.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by jinzj on 2016/6/1.
 */
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                CoreConfig.class, MVCConfig.class, LoggingConfig.class, SpringSecurityConfig.class,
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
