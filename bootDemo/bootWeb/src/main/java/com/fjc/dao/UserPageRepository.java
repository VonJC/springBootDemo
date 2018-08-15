package com.fjc.dao;

import com.fjc.vo.UserVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author:fjc
 * @Description:
 * @Date: 2018/7/11
 **/

public interface UserPageRepository extends PagingAndSortingRepository<UserVO, Integer> {
    Page<UserVO> findByName(String name, Pageable pageAble);
}
