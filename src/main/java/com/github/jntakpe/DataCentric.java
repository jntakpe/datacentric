package com.github.jntakpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DataCentric {

    public static void main(String[] args) {
        SpringApplication.run(DataCentric.class, args);
    }

}
