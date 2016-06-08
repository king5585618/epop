/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.web.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.event.LoggerListener;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jinzj on 2016/6/3.
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    private final static Log log = LogFactory.getLog(SpringSecurityConfig.class);

    @Override
    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/login");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        自带的登录界面
//        http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
//        http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll();

//        没有权限则跳转到异常页
//        http.authorizeRequests().antMatchers("/**").hasRole("USER").and().exceptionHandling().accessDeniedPage("/login");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("password")
                .roles("USER");
    }

    @Bean
    public LoggerListener loggerListener(){
        LoggerListener loggerListener = new LoggerListener();
        return loggerListener;
    }

    @Bean
    public org.springframework.security.authentication.event.LoggerListener eventLoggerListener(){
        org.springframework.security.authentication.event.LoggerListener loggerListener =
                new org.springframework.security.authentication.event.LoggerListener();
        return loggerListener;
    }

}
