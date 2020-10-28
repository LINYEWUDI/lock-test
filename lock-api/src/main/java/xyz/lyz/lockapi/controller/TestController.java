package xyz.lyz.lockapi.controller;

import net.bestjoy.cloud.cache.RedisLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lyz.service.LockService;

@RestController
@RequestMapping
public class TestController {

    @Autowired
    private LockService lockService;


    @GetMapping("show")
    public void saveAcceptanceResult() {
        System.out.println("hello lock !");
    }

}
