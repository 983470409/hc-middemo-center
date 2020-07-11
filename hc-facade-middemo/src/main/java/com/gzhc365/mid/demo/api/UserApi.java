package com.gzhc365.mid.demo.api;

import com.gzhc365.mid.demo.entity.User;
import com.gzhc365.mid.demo.vo.UserVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: zhang_yx
 * @Date: 2020/7/11 18:49
 */
public interface UserApi {

    /**
     * 返回用户信息
     * @param userVo
     * @return
     */
    @RequestMapping(value = "user/getUser",method = RequestMethod.POST)
    User getUser(@RequestBody UserVo userVo);
}
