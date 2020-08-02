package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTools {

    // 编写全局配置属性
    private static final String CON_FIG = "applicationContext.xml";
    private static final ApplicationContext context;

    // 使用静态块，在加载就调用一次
    static{
        context = new ClassPathXmlApplicationContext(CON_FIG);
    }

    //    编写 静态调用方法
    public static Object getSpringBean(String baen){
        return context.getBean(baen);
    }
}
