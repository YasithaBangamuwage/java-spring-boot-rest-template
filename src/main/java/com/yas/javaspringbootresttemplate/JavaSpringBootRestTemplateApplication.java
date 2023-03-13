package com.yas.javaspringbootresttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/hello")
public class JavaSpringBootRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringBootRestTemplateApplication.class, args);
    }

    @GetMapping()
    public String getGreeting() {
        return "Hello spring boot application";
    }

}
