package xyz.lyz.service;

import net.bestjoy.cloud.cache.RedisLock;
import org.springframework.stereotype.Service;

@Service
public class LockService {

    @RedisLock(key = "lyz",expire = 30000000, isTry = true)
    public void serviceTest1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"======我是没有返回值的方法 !");
    }

    @RedisLock(key = "lyz",expire = 30000000, isTry = true)
    public String serviceTest() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName()+"======"+"我是有返回值的方法";
    }
}
