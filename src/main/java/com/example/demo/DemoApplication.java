package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example.demo"})
@RestController
public class DemoApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    System.out.println("메인 클래스 시작");
    SpringApplication.run(DemoApplication.class, args);
    System.out.println("메인 클래스 실행 완료");
  }

  @RequestMapping("/hello")
  public String hello() {
    return "hello world";
  }
}
