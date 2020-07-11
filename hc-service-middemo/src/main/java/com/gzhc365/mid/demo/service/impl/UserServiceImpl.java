package com.gzhc365.mid.demo.service.impl;

import com.gzhc365.mid.demo.entity.User;
import com.gzhc365.mid.demo.service.UserService;
import com.gzhc365.mid.demo.vo.UserVo;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhang_yx
 * @Date: 2020/7/11 19:49
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(UserVo userVo) {
        return new User();
    }


}
