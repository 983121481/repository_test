package com.controller;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @date 2021-01-21 16:53
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


}
