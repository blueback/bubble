package com.antsoft.application.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationListener;

/**
 * Spring boot 启动监听类
 * 可以获取到SpringApplication对象，做一些执行前的设置
 */
public class AntSoftApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    public static Logger logger = LoggerFactory.getLogger(AntSoftApplicationStartedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
//        SpringApplication app = applicationStartedEvent.getSpringApplication();
        logger.info("1111");
    }
}
