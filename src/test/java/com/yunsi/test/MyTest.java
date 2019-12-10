package com.yunsi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 作者：zz
 * 日期：2019-12-09
 * 2019/12/9
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private String hello;

    @Test
    public void test1(){
        String[] beanNames = ctx.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("#"+beanName);

        }
        System.out.println(beanNames.length);
        System.out.println("hello="+hello);

    }
}
