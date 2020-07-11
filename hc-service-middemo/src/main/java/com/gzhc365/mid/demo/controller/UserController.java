package com.gzhc365.mid.demo.controller;

import com.gzhc365.mid.demo.api.UserApi;
import com.gzhc365.mid.demo.entity.User;
import com.gzhc365.mid.demo.service.UserService;
import com.gzhc365.mid.demo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhang_yx
 * @Date: 2020/7/11 19:46
 */
@RestController
@RequestMapping("/")
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    /**
     * 返回用户信息
     *
     * @param userVo
     * @return
     */
    @Override
    public User getUser(UserVo userVo) {
        return userService.getUser(userVo);
    }
}
