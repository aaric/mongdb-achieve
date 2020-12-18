package com.sample.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot launcher.
 *
 * @author Aaric, created on 2018-05-09T12:03.
 * @since 0.1.0-SNAPSHOT
 */
@SpringBootApplication
public class Application {

    /**
     * main
     *
     * @param args custom inputs
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
