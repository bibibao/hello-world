package com.freemud.service.impl;

import com.freemud.dto.UserDto;
import com.freemud.service.IUserService;
import com.freemud.vo.ApiResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;



/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: UserServiceImpl
 * @Package com.freemud.service.impl
 * @Description: 用户服务
 * @author: xuebao.hu
 * @date: 2019/1/16 9:36
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
@Service
public class UserServiceImpl implements IUserService{
    @Override
    public ApiResult<UserDto> queryUser() {
        UserDto userDto = new UserDto();
        userDto.setName("Harvey");
        userDto.setSex(1);
        userDto.setEmail("123@abc.com");
        ArrayList<String> list = new ArrayList<>();
        list.add("12112231312");
        list.add("13323323232");
        userDto.setPhoneList(list);
        userDto.setAddress("purple rain world stree!");
        return new ApiResult<>(100,"success ！", userDto);
    }
}
