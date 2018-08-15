package com.fjc.dao;

import com.fjc.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:fjc
 * @Description:
 * @Date: 2018/7/11
 **/
@Repository
public interface UserRepository extends JpaRepository<UserVO,Integer> {

    UserVO findByName(String name);

    List<UserVO> getAllByName(String name);

}
