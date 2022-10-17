package com.liyongwei.service;

import com.spring.*;

@Component("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Autowired
    private OrderService orderService;

    private String name;

    @Override
    public void test() {
        System.out.println(orderService);
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }
}
