package xyz.lyz.lockapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LockApiApplicationTests extends BaseTest {

    private final static String url = "/show";
    private final static String url1 = "/show1";


    @Test
    public void contextLoads() throws Exception {

//        quickCreateForJson(HttpMethod.GET,url,"");

        Runnable runnable = () -> {
            try {
                quickCreateForJson(HttpMethod.GET,url,"");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        final Thread thread = new Thread(runnable);
        final Thread thread1 = new Thread(runnable);
        final Thread thread2 = new Thread(runnable);

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();

        System.out.println("主线程执行完成");

    }

}
