package com.happycommunity.gateway.request.app.user;

import com.happycommunity.gateway.request.CommonRequest;

/**
 * @author Danny
 * @Title: RegisterRequest
 * @Description:
 * @Created on 2018-11-29 12:47:05
 */
public class RegisterRequest extends CommonRequest {
    private String userName;
    private String rsaPassword;

    public String getUserName() {
        return userName;
    }

    public RegisterRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getRsaPassword() {
        return rsaPassword;
    }

    public RegisterRequest setRsaPassword(String rsaPassword) {
        this.rsaPassword = rsaPassword;
        return this;
    }
}
