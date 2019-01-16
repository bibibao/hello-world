package com.freemud.dto;

import lombok.Data;

import java.util.List;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: UserDto
 * @Package com.freemud.dto
 * @Description: 用户实体类
 * @author: xuebao.hu
 * @date: 2019/1/16 9:27
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
@Data
public class UserDto {
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 0 女 ，1男
     */
    private Integer sex;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * 电话列表
     */
    private List<String> phoneList;
    /**
     * 住址
     */
    private String address;
}
