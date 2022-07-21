package com.test.service.user;

import com.test.core.model.PageWrap;
import com.test.dao.user.model.User;
import com.test.service.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

/**
 * 示例单元测试
 * @author 155****3572
 * @date 2022/07/21 16:43
 */
@Slf4j
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = UserServiceTest.class)
@Transactional
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void createTest() {
        User user = new User();
        user.setNickname("test");
        print(userService.create(user));
    }

    @Test
    public void deleteByIdTest() {
        userService.deleteById(1);
        print(null);
    }

    @Test
    public void deleteByIdInBatchTest() {
        userService.deleteByIdInBatch(Arrays.asList(1, 2 ,3));
        print(null);
    }

    @Test
    public void updateByIdTest() {
        User user = new User();
        user.setId(1);
        user.setNickname("test");
        userService.updateById(user);
        print(null);
    }

    @Test
    public void updateByIdInBatchTest() {
        User user1 = new User();
        user1.setId(1);
        user1.setNickname("test");
        User user2 = new User();
        user2.setId(2);
        user2.setNickname("test");
        userService.updateByIdInBatch(Arrays.asList(user1, user2));
        print(null);
    }

    @Test
    public void findByIdTest() {
        print(userService.findById(1));
    }

    @Test
    public void findOneTest() {
        User user = new User();
        user.setNickname("test");
        print(userService.findOne(user));
    }

    @Test
    public void findListTest() {
        User user = new User();
        user.setNickname("test");
        print(userService.findList(user));
    }

    @Test
    public void findPageTest() {
        User user = new User();
        user.setNickname("test");
        PageWrap<User> pageWrap = new PageWrap<>();
        pageWrap.setModel(user);
        print(userService.findPage(pageWrap));
    }

    @Test
    public void countTest() {
        User user = new User();
        user.setNickname("test");
        print(userService.count(user));
    }
}
