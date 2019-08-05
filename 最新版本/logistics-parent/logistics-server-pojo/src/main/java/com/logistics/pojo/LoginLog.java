package com.logistics.pojo;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class LoginLog {
    private String loginLogId;

    private String loginName;

    private String ipAddress;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date loginTime;

    public String getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(String loginLogId) {
        this.loginLogId = loginLogId == null ? null : loginLogId.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}