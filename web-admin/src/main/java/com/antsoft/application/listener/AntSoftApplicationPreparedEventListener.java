package com.antsoft.application.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的。
 * 在获取完上下文后，可以将上下文传递出去做一些额外的操作。
 * Created by justin on 16/8/23.
 */
public class AntSoftApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
//        ConfigurableApplicationContext cac = event.getApplicationContext();
    }
}
