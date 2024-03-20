package com.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.nio.file.Paths;

//@EnableConfigurationProperties
@ComponentScan(basePackages = {"com.automation.test"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver",
                Paths.get("src/test/resources/chromedriver/chromedriver").toString());
        ChromeOptions options = new ChromeOptions();
        return new ChromeDriver(options);
    }
}
