package com.sparta.spring3wpractice5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Spring3WPractice5Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring3WPractice5Application.class, args);
    }

}
