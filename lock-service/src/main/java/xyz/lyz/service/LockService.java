package xyz.lyz.service;

import net.bestjoy.cloud.cache.RedisLock;
import org.springframework.stereotype.Service;

@Service
public class LockService {

    @RedisLock(key = "lyz")
    public String serviceTest() {
        return "hello lock !";
    }
}
