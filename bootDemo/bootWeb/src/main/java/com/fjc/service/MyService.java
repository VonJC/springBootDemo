package com.fjc.service;

import com.fjc.dao.UserPageRepository;
import com.fjc.dao.UserRepository;
import com.fjc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:fjc
 * @Description:
 * @Date: 2018/7/11
 **/
@Service
@Transactional
public class MyService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserPageRepository userPageRepository;

    public void saveUser(UserVO user){
        userRepository.save(user);
    }

    public UserVO getUser(){
        return userRepository.findByName("冯佳财");
    }

    public List<UserVO> getUserList(){
        return userRepository.getAllByName("冯佳财");
    }

    public Page<UserVO> getUserPage(){
        PageRequest page = new PageRequest(0,10, new Sort(Sort.Direction.DESC, "id"));
        return userPageRepository.findByName("冯佳财", page);
    }

}
