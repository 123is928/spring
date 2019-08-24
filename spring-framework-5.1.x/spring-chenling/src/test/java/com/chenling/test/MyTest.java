package com.chenling.test;

import com.chenling.app.AppConfig;
import com.chenling.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述
 *
 * @author 陈岭
 * date： 2019/8/23
 * @version 1.0
 */
public class MyTest {
	@Test
	public void fun(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		annotationConfigApplicationContext.refresh();
		UserService service = annotationConfigApplicationContext.getBean(UserService.class);
		service.query();
	}
}
