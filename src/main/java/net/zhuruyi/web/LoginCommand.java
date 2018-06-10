package net.zhuruyi.web;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 22:01 2018/6/9
 * @Modified By:
 */
public class LoginCommand {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginCommand{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
