package com.cloudpure.springboot.web.controller;

import com.cloudpure.springboot.web.domain.pojo.Students;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CloudPure on 2017/11/24.
 */
@RestController
public class IndexControllerRest {
    private static final Logger logger=Logger.getLogger(IndexController.class);
    @Value("${application.hello}")
    private String hello;

    @RequestMapping(value = "/msg",method = RequestMethod.GET)
    public String showMsg(){
        logger.info("**************"+"信息:"+hello+"****************");

        Students students=new Students();
        String string=students.gretting("Good Job!!!!");
        logger.info("***********"+string+"*************************");
        return "信息:"+hello+"\n"+string;
    }
}
