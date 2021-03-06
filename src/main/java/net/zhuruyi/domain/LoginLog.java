package net.zhuruyi.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 11:15 2018/6/9
 * @Modified By:
 */
public class LoginLog implements Serializable {

    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;


    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
                "loginLogId=" + loginLogId +
                ", userId=" + userId +
                ", ip='" + ip + '\'' +
                ", loginDate=" + loginDate +
                '}';
    }
}
