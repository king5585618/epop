/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.service.service;

import com.huotu.epop.model.entity.User;

/**
 * Created by jinzj on 2016/6/8.
 */
public interface UserService {

    User findOne(Long userId);

    void testTimeByGetUser();
}
