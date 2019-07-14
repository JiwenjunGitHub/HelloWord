package com.jwj.controller;

import com.jwj.pojo.Jiwenjun;
import com.jwj.pojo.ResponseBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/14.
 */
@RestController
public class HelloWorld {
    @RequestMapping(method = RequestMethod.GET,value = "hello")
    public ResponseBody HelloWorld(int status){
        Jiwenjun jwj=new Jiwenjun(170,150,"李洋洋","程序员");
        ResponseBody responseBody = new ResponseBody();
        responseBody.setMessage("太棒了");
        responseBody.setStatus(status);
        responseBody.setDate(jwj);
        return responseBody;
    }
}
