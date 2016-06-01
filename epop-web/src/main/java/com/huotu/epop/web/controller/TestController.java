package com.huotu.epop.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jinzj on 2016/6/1.
 */
@Controller
public class TestController {
    private static final Log log = LogFactory.getLog(TestController.class);

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test(){
        log.info("test");
    }
}
