package com.gzhc365.mid.demo.service;

import com.gzhc365.mid.demo.entity.User;
import com.gzhc365.mid.demo.vo.UserVo;

/**
 * @Auther: zhang_yx
 * @Date: 2020/7/11 19:48
 */
public interface UserService {

    User getUser(UserVo userVo);
}
