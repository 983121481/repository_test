package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @date 2021-01-21 16:40
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Page<User> findAllByPage(Integer page, Integer size) {
        //分页 排序
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.DESC);

        return userDao.findAll(pageable);
    }
}
