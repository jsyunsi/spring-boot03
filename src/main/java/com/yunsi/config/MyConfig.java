package com.yunsi.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 作者：zz
 * 日期：2019-12-09
 * 2019/12/9
 */
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter{

//    @ConditionalOnClass(name={"org.apache.commons.dbcp.BasicDataSource"})
//    @Bean
//    public String hello(){
//        return "hello";
//    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/" ).setViewName("login");
    }



    private class MyLocaleResolver implements LocaleResolver{
        @Override
        public Locale resolveLocale(HttpServletRequest request) {
            String l = request.getParameter("l");
            Locale locale = Locale.getDefault();
            if(!StringUtils.isEmpty(l))
            {
                String[] split = l.split("_");
                locale = new Locale(split[0], split[1]);
                return locale;

            }
            System.out.println("###"+locale);
            return locale;
        }

        @Override
        public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

        }
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }


}
