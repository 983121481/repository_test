package com.tmin.controller;

import com.tmin.pojo.User;
import com.tmin.service.UserService;
import com.tmin.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author
 * @date 2021-01-21 16:53
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user/findAll")
    public ResultVo<Page<User>> findAllByPage(@RequestParam(defaultValue = "0")Integer page,@RequestParam(defaultValue = "5")Integer size){
        return ResultVo.of(userService.findAllByPage(page, size));
    }
}
