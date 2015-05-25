package com.huan;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * Created by huan on 2015/5/25 0025.
 */
public class SpringTest {
    public static void main(String[] args) {

        //实例化Application
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        //使用getMessage()方法获取本地消息
        //Local的getDefault()方法返回计算机环境的默认Local

        String hello = ctx.getMessage("hello",new String[]{"孙悟空"}, Locale.getDefault(Locale.Category.FORMAT));
        String now = ctx.getMessage("now",new Object[]{new Date()},Locale.getDefault(Locale.Category.FORMAT));

        System.out.println(hello);
        System.out.println(now);


    }
}
