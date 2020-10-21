package com.ely.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ely.domain.User;
import com.ely.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //使用spring的容器作为平台运行junit
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})   //通过配置文件获取context容器
public class SpringWithJunitTest {
    @Autowired     //自动注入
    private UserService userService;

    @Test
    public void test01() {
        User user = userService.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
