package com.cloudpure.springboot.web.domain.pojo;

/**
 * Created by CloudPure on 2017/11/24.
 */
public class Students implements PersonInterFace {
    @Override
    public String gretting(String str) {
        return str;
    }
}
