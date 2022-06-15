package com.miao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fuguo
 * @projectName small-spring
 * @time 2022/6/15/015 14:36
 * @description
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBean(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
