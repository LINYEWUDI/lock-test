package xyz.lyz.lockapi;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class BaseTest {


    public MockMvc mockMvc;


    /**
     * web项目上下文
     */
    @Autowired
    public WebApplicationContext webApplicationContext;

    /**
     * 所有测试方法执行之前执行该方法
     */
    @Before
    public void before() {
        //获取mockmvc对象实例
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    public  void quickCreateForJson(HttpMethod httpMethod, String url, String str) throws Exception {

        //判断请求方式
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder;
        if (HttpMethod.POST == httpMethod){
            mockHttpServletRequestBuilder = MockMvcRequestBuilders.post(url);
        }else{
            mockHttpServletRequestBuilder = MockMvcRequestBuilders.get(url);
        }

        /**
         * 请求包装类生成
         * 拿到返回的字符串json
         */
        final String string =
                mockMvc.perform(
                        mockHttpServletRequestBuilder
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(str)//更换实体类json
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                ).andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();
        //输出返回结果
        System.out.println(string);
    }
}
