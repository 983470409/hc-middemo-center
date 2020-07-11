package com.gzhc365.mid.demo.facade;

import com.gzhc365.mid.demo.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Auther: zhang_yx
 * @Date: 2020/7/11 18:57
 */
@FeignClient(value = "MIDDEMO-CENTER", url = "${middemo-url:}")
public interface UserFacade extends UserApi {
}
