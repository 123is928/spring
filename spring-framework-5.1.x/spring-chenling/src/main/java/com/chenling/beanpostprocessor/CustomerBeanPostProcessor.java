package com.chenling.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 功能描述
 *
 * @author 陈岭
 * date： 2019/8/24
 * @version 1.0
 */
public class CustomerBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("postProcessBeforeInitialization");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("postProcessAfterInitialization");
		}
		return bean;
	}
}
