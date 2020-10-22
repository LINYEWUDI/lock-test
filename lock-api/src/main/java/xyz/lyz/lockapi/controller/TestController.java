package xyz.lyz.lockapi.controller;

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
    public String saveAcceptanceResult() {
        return lockService.serviceTest();
    }
}
