package com.cloudpure.springboot.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by CloudPure on 2017/11/24.
 * Sping Boot  多模块集成jsp 中，不仅要在application.properties 配置web路径，
 * 还需要，继承WebMvcConfigurationAdapter的配置类
 * 否则会找不到页面
 */
@EnableWebMvc
@Configuration
public class JSPWebMvcConfig extends WebMvcConfigurerAdapter{

    /** 指定默认文件的地址，jsp页面引入js和css的时候就不用管项目路径了 */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static/");
        super.addResourceHandlers(registry);
    }

    /**
     * 多模块的jsp访问，默认是src/main/webapp，但是多模块的目录只设置yml文件不行
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        System.out.println("*********************/WEB-INF/jsp/************************");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
        resolver.setPrefix("/WEB-INF/jsp/"); // jsp目录
        resolver.setSuffix(".jsp");
        return resolver;
    }

}
