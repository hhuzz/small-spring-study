package com.miao.test;

import com.miao.BeanDefinition;
import com.miao.BeanFactory;
import com.miao.test.bean.UserService;
import org.junit.Test;

/**
 * @author fuguo
 * @projectName small-spring
 * @time 2022/6/15/015 14:40
 * @description
 */
public class ApiTest {

    @Test
    public void testBeanFactory() {
        //1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBean("userService", beanDefinition);

        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
