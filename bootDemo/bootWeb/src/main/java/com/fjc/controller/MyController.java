package com.fjc.controller;

import com.fjc.dao.UserRepository;
import com.fjc.service.MyService;
import com.fjc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


/**
 * @Author:fjc
 * @Description:
 * @Date: 2018/7/11
 **/
@RestController
@RequestMapping
public class MyController {

    @Autowired
    private MyService myService;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Page<UserVO> index(){
//        UserVO user = new UserVO();
//        String id = UUID.randomUUID().toString().replace("-", "");
//        user.setId(id);
//        user.setName("冯佳财");
//        user.setAge(27);
//        user.setBirth("19920425");
//        user.setSex(1);
//        myService.saveUser(user);
//        return myService.getUser();
//        return "hello world";
//        return myService.getUserList();
        return myService.getUserPage();
    }
}
