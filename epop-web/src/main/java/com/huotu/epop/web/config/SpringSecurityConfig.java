/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jinzj on 2016/6/3.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

//    private final static Log log = LogFactory.getLog(SpringSecurityConfig.class);

//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    private UserDetailsService userDetailsService;

    @Override
    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/login");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
//        auth.userDetailsService(userDetailsService()).passwordEncoder(
//                new Md5PasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        自带的登录界面
//        http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
        http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll();

//        没有权限则跳转到异常页
//        http.authorizeRequests().antMatchers("/**").hasRole("USER").and().exceptionHandling().accessDeniedPage("/login");

    }

}
