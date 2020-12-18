package com.sample.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot launcher.
 *
 * @author Aaric, created on 2020-12-18T16:25.
 * @version 0.3.0-SNAPSHOT
 */
@SpringBootApplication
public class TestApp {

    /**
     * main
     *
     * @param args custom inputs
     */
    public static void main(String[] args) {
        SpringApplication.run(TestApp.class, args);
    }
}
