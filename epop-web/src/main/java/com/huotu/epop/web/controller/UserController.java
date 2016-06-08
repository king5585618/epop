/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.epop.web.controller;

import com.huotu.epop.model.entity.User;
import com.huotu.epop.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by jinzj on 2016/6/8.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/testTimeByGetUser", method = RequestMethod.GET)
    public void testTimeByGetUser() {

    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    @ResponseBody
    public void getUsers() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }
}
