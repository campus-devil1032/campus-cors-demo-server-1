package com.campus.campuscorsdemoserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CampusCorsDemoServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(CampusCorsDemoServer1Application.class, args);
    }

    @RestController
    // 아래 크로스 오리진 코드의 주석을 해체하면 CORS 이슈가 더이상 발생하지 않는다.
    @CrossOrigin("*")
    public static class MyController {
        @GetMapping("/api/data")
        public String getData() {
            return "Data from Server A";
        }
    }
}
