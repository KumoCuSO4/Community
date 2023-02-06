package com.mgp.community;

import com.mgp.community.dao.UserMapper;
import com.mgp.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUsername("usertest");
        user.setPassword("1234");
        user.setSalt("5678");
        user.setEmail("111@22.33");
        user.setType(1);
        user.setStatus(2);
        user.setActivationCode("4321");
        user.setHeaderUrl("111.com");
        user.setCreateTime(new Date());

        int rows = userMapper.insertUser(user);
        System.out.println(rows);
        System.out.println(user.getId());
    }

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdateUser() {
        int row = userMapper.updateHeader(1, "7777");
        System.out.println(row);
    }
}
