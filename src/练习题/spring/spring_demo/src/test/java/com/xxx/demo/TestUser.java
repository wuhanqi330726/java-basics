package com.xxx.demo;

//import com.xxx.demo.config.AppConfig;
import demo.User;
import demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestUser {

    @Autowired
    private User user;

    @Test
    public void test(){
        user.add();
    }

}
