package net.zhuruyi.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import net.zhuruyi.domain.User;
import net.zhuruyi.service.UserService;
import net.zhuruyi.web.LoginCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 21:58 2018/6/9
 * @Modified By:
 */
@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/index.html")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
        boolean isValidUser = userService
                .hasMatchUser(loginCommand.getUserName(), loginCommand.getPassword());

        if (!isValidUser) {
            return new ModelAndView("login", "error", "用户名或密码错误");
        } else {
            User user = userService.findUserByUserName(loginCommand.getUserName());

            user.setLastIp(request.getLocalAddr());
            SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            user.setLastVisit(Timestamp.valueOf(simpleDate.format(new Date())));
            userService.loginSuccess(user);
            request.getSession().setAttribute("user", user);
            return new ModelAndView("main");
        }
    }
}
