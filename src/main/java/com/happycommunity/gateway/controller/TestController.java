package com.happycommunity.gateway.controller;

import com.alibaba.fastjson.JSON;
import com.happycommunity.framework.core.model.enums.ResultStatusEnum;
import com.happycommunity.gateway.response.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * @author Danny
 * @Title: TestController
 * @Description:
 * @Created on 2018-11-23 16:36:40
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/getRandomData")
    @ResponseBody
    public ResponseData getRandomData(HttpServletRequest httpServletRequest){
        ResponseData responseData=new ResponseData(ResultStatusEnum.SUCCESS,new Random().nextDouble());
        System.out.println(JSON.toJSONString(responseData));
        return responseData;
    }
}
