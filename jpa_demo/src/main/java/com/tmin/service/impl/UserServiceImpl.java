package com.tmin.service.impl;

import com.tmin.dao.UserDao;
import com.tmin.pojo.User;
import com.tmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

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
        Sort sort = Sort.by(Sort.Order.desc("id"));
        Pageable pageable = PageRequest.of(page, size, sort);

        return userDao.findAll(pageable);
    }
}
