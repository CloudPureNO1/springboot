package com.cloudpure.springboot.web;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by CloudPure on 2017/11/24.
 * Sping Boot  多模块集成jsp 中，不仅要在application.properties 配置web路径，
 * 还需要，继承WebMvcConfigurationAdapter的配置类
 * 否则会找不到页面
 */
public class JSPWebMvcConfig extends WebMvcConfigurerAdapter{

    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver()
    }


}
