package com.cloudpure.springboot.web.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by CloudPure on 2017/11/24.
 */
@Controller
public class IndexController {
    private static final Logger logger=Logger.getLogger(IndexController.class);
    @Value("${application.username}")
    private String username;
    @Value("${application.welcome}")
    private String welcome;
    @Value("${application.hello}")
    private String hello;

    @RequestMapping(value="/msg1",method = RequestMethod.GET)
    public String showAllMsg(HashMap<String,Object> map){
        map.put("msg","This is a message from wangsm!");
        map.put("username",username);
        map.put("welcome",welcome);
        map.put("hello",hello);

        logger.info("This is a message from wangsm!\tmsg1");
        logger.info("*******"+hello+"\t 是乱码吗？");
        return "index";
    }

    @RequestMapping(value = "/msg2",method = RequestMethod.GET)
    public String showAllMsg2(HttpServletRequest request){
        request.setAttribute("msg",username+" "+welcome);
        request.setAttribute("username",username);
        request.setAttribute("welcome",welcome);
        request.setAttribute("hello",hello);

        logger.info(username+" "+welcome+"\tmsg2");
        return "index";
    }


    @RequestMapping(value = "/msg3",method = RequestMethod.GET)
    public String showAllMsg3(Model model){
        model.addAttribute("msg","This is a message from Spring Boot!");
        model.addAttribute("username",username);
        model.addAttribute("welcome",welcome);
        model.addAttribute("hello",hello);

        logger.info("This is a message from Spring Boot!\tmsg3");
        return  "index";
    }

    @RequestMapping(value = "/msg4",method = RequestMethod.GET)
    public ModelAndView showAllMsg4(){
        ModelAndView modelAndView=new ModelAndView("/index");
        modelAndView.addObject("msg",username+" "+welcome+" "+hello);
        modelAndView.addObject("username",username);
        modelAndView.addObject("welcome",welcome);
        modelAndView.addObject("hello",hello);

        logger.info(username+" "+welcome+" "+hello+"\tmsg4");
        return modelAndView;
    }

}
