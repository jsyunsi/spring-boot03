package com.yunsi.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 作者：zz
 * 日期：2019-12-09
 * 2019/12/9
 */
@Configuration
public class MyConfig {

    @ConditionalOnClass(name={"org.apache.commons.dbcp.BasicDataSource"})
    @Bean
    public String hello(){
        return "hello";
    }


}
