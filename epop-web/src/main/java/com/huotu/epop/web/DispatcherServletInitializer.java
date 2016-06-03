package com.huotu.epop.web;

import com.huotu.epop.web.config.CoreConfig;
import com.huotu.epop.web.config.LoggingConfig;
import com.huotu.epop.web.config.MVCConfig;
import com.huotu.epop.web.config.SpringSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by jinzj on 2016/6/1.
 */
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                CoreConfig.class, MVCConfig.class, LoggingConfig.class, SpringSecurityConfig.class
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
