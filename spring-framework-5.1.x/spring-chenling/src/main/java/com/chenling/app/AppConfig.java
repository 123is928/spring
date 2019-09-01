package com.chenling.app;

import com.chenling.dao.UserDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 功能描述
 *
 * @author 陈岭
 * date： 2019/8/23
 * @version 1.0
 */
@Configuration
@ComponentScan("com.chenling")
@Import(UserDao.class)
public class AppConfig {

}
