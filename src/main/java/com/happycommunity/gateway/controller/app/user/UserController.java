package com.happycommunity.gateway.controller.app.user;

import com.happycommunity.business.api.user.UserBusinessService;
import com.happycommunity.gateway.request.app.user.LoginRequest;
import com.happycommunity.gateway.request.app.user.RegisterRequest;
import com.happycommunity.gateway.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Danny
 * @Title: UserController
 * @Description:
 * @Created on 2018-11-26 22:36:49
 */
@Controller
@RequestMapping("/app/user")
public class UserController {

    @Autowired
    private UserBusinessService userBusinessService;

    @RequestMapping
    public ResponseData register(HttpServletRequest request, RegisterRequest registerRequest){
        return new ResponseData(null,null);
    }

    @RequestMapping
    public ResponseData login(HttpServletRequest request, LoginRequest loginRequest){
        return new ResponseData(null,null);
    }
}
