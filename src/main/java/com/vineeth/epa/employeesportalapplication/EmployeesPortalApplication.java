package com.vineeth.epa.employeesportalapplication;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class EmployeesPortalApplication {

    @Value("${server.port}")
    public int appName;

    public static int staticValue;

    /*
       @PostConstruct - why we use this annotation?
       -> it is
    */

    @PostConstruct
    public void init() {
    staticValue = appName;
    }

    private static final Logger logger = LoggerFactory.getLogger(EmployeesPortalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EmployeesPortalApplication.class, args);
        logger.info("Application started");
        System.out.println("port"+staticValue);
    }

}
