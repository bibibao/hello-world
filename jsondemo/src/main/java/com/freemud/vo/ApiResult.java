package com.freemud.vo;

import lombok.Data;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: ApiResult
 * @Package com.freemud.vo
 * @Description: 返回实体类
 * @author: xuebao.hu
 * @date: 2019/1/16 9:21
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
@Data
public class ApiResult<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态描述
     */
    private String msg;
    /**
     * 返回实体
     */
    private T data;

    public ApiResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
