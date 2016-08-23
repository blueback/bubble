package com.antsoft;

import com.antsoft.application.listener.AntSoftApplicationEnvironmentPreparedEvent;
import com.antsoft.application.listener.AntSoftApplicationFailedEventListener;
import com.antsoft.application.listener.AntSoftApplicationPreparedEventListener;
import com.antsoft.application.listener.AntSoftApplicationStartedEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by justin on 16/8/22.
 */
@SpringBootApplication
public class Application {

    public  static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        //添加启动事件监听机制
//        app.addListeners(new AntSoftApplicationStartedEventListener());
//        app.addListeners(new AntSoftApplicationEnvironmentPreparedEvent());
//        app.addListeners(new AntSoftApplicationPreparedEventListener());
//        app.addListeners(new AntSoftApplicationFailedEventListener());
        app.run(args);
    }
}
