package com.freemud.controller;

import com.freemud.dto.UserDto;
import com.freemud.service.IUserService;
import com.freemud.vo.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: JsonController
 * @Package com.freemud.controller
 * @Description: 这是一个测试控制层
 * @author: xuebao.hu
 * @date: 2019/1/16 9:20
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class JsonController {
    @Autowired
    IUserService userService;
    @GetMapping(value = "/user/query",produces = "application/json" )
    ApiResult<UserDto> queryUser(){
        return userService.queryUser();
    }
}
