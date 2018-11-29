package com.happycommunity.gateway.request.app.user;

import com.happycommunity.gateway.request.CommonRequest;

/**
 * @author Danny
 * @Title: LoginRequest
 * @Description:
 * @Created on 2018-11-28 23:03:12
 */
public class LoginRequest extends CommonRequest {

    private String userName;
    private String rsaPassword;

    public String getUserName() {
        return userName;
    }

    public LoginRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getRsaPassword() {
        return rsaPassword;
    }

    public LoginRequest setRsaPassword(String rsaPassword) {
        this.rsaPassword = rsaPassword;
        return this;
    }
}
