package com.liyongwei;

import com.liyongwei.config.ApplicationConfig;
import com.liyongwei.service.UserService;
import com.spring.ApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ApplicationContext(ApplicationConfig.class);

        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.test();

    }
}
