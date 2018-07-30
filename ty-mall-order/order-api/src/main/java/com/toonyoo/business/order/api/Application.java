package com.toonyoo.business.order.api;

import com.spring4all.swagger.EnableSwagger2Doc;
import com.toonyoo.micro.cloud.datasource.multi.EnableDynamicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages={"com.toonyoo.business.order.api"})
@EnableDynamicDataSource
@EnableAsync
@EnableScheduling
@EnableAspectJAutoProxy
@EnableSwagger2Doc
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
