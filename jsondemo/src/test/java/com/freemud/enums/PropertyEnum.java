package com.freemud.enums;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: PropertyEnum
 * @Package com.freemud.enums
 * @Description: 简单描述下这个类是做什么用的
 * @author: xuebao.hu
 * @date: 2019/1/14 20:53
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public enum PropertyEnum {
    USER("zhangsan"),CUSTOMER("lisi");
    /**
     * 名称
     */
    private String name;

    PropertyEnum(String name) {
        this.name = name;
    }
}
