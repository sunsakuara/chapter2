package net.zhuruyi.service;

import static org.junit.Assert.assertTrue;

import net.zhuruyi.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 14:06 2018/6/9
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring/smart-context.xml")//启动spring容器
public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests {


    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;

    }

    @Test
    public void hasMatchUser() {
        boolean b1 = userService.hasMatchUser("admin", "123456");
        boolean b2 = userService.hasMatchUser("admin", "1231");
        assertTrue(b1);
        assertTrue(b2);
    }

    @Test
    public void findUserName() {
        User user = userService.findUserByUserName("admin");
//        assertArrayEquals(user.getUserName(),"asmin");
    }
}
