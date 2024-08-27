package com.vineeth.epa.employeesportalapplication.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

    @Value("${spring.application.name}")
    public String appName;

    @GetMapping("/getDetails")
    public String getDbDetails(){
        return "Hi "+appName;
    }
}
