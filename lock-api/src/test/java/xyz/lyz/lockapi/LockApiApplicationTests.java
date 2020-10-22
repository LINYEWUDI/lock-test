package xyz.lyz.lockapi;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class LockApiApplicationTests extends BaseTest {

    private final static String url = "/show";


    @Test
    void contextLoads() {
        try {
            quickCreateForJson(HttpMethod.GET,url,"");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
