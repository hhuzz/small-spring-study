package com.miao;

/**
 * @author fuguo
 * @projectName small-spring
 * @time 2022/6/15/015 14:35
 * @description 手写spring第一步
 */
public class BeanDefinition {
    private Object bean;

    public Object getBean() {
        return bean;
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
}
