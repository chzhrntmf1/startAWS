package com.startAws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);

    }
}

// insert into posts (author, content, title, modified_date, created_date) values ('hyeonwoo', 'content', 'title', '20241212', '20241212')