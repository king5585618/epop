/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.service;

import com.huotu.epop.service.support.BaseRepositoryFactoryBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by jinzj on 2016/6/8.
 */
@Configuration
@ComponentScan({"com.huotu.epop.service.service","com.huotu.epop.service.aspect"})
/**
 * 使用自定义的repository
 */
@EnableJpaRepositories(value = {"com.huotu.epop.service.repository"},repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class ServiceConfig {
}
