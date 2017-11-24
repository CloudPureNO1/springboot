package com.cloudpure.springboot.web.domain;

import com.cloudpure.springboot.web.domain.pojo.Students;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebDomainApplication {
private static final Logger logger=Logger.getLogger(WebDomainApplication.class);
	public static void main(String[] args) {
		Students students=new Students();
		String gretting=students.gretting("Happy NewYear!");
		logger.info("**************"+gretting+"*****************");
		SpringApplication.run(WebDomainApplication.class, args);
		logger.info("**************"+gretting+"*****************");
	}
}
