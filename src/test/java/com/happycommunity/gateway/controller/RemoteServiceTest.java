package com.happycommunity.gateway.controller;

import com.alibaba.fastjson.JSON;
import com.happycommunity.business.api.user.UserBusinessService;
import com.happycommunity.business.model.parameter.LoginParameter;
import com.happycommunity.framework.common.model.dto.user.UserDTO;
import com.happycommunity.framework.common.model.result.ServiceResult;
import com.happycommunity.gateway.AbstractTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Danny
 * @Title: RemoteServiceTest
 * @Description:
 * @Created on 2018-11-28 23:50:31
 */
public class RemoteServiceTest extends AbstractTest {

    @Autowired
    private UserBusinessService userBusinessService;

    @Test
    public void findUserTest(){
        ServiceResult loginResult=userBusinessService.login(new LoginParameter().setUserName("Danny"));
        System.out.println(JSON.toJSONString(loginResult));
    }
}
