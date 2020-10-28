package xyz.lyz.lockapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = "xyz.lyz")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class LockApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LockApiApplication.class, args);
    }

}
