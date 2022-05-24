package com.samsung.childrensdevelopmentcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.Console;

@SpringBootApplication
public class ChildrensDevelopmentCenterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ChildrensDevelopmentCenterApp.class, args);


        // url h2 консоли: http://localhost:8080/h2-console
        // url базы: jdbc:h2:mem:testdb

//        try {
//            //Консоль для визуализации бд в браузере
//            Console.main(args);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}
