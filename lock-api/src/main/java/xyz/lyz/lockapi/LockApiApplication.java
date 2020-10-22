package xyz.lyz.lockapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "xyz.lyz")
public class LockApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LockApiApplication.class, args);
    }

}
