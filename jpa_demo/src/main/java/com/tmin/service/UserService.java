package com.tmin.service;

import com.tmin.pojo.User;
import org.springframework.data.domain.Page;

/**
 * @author
 * @date 2021-01-21 16:37
 */
public interface UserService {

    /**
     * 分页查询用户信息
     * @param page 当前页
     * @param size 每页条数
     * @return
     */
    Page<User> findAllByPage(Integer page, Integer size);
}
