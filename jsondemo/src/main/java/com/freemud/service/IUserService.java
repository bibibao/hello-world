package com.freemud.service;

import com.freemud.dto.UserDto;
import com.freemud.vo.ApiResult;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: IUserService
 * @Package com.freemud.service
 * @Description: 用户服务接口
 * @author: xuebao.hu
 * @date: 2019/1/16 9:35
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface IUserService {
    ApiResult<UserDto> queryUser();
}
