package com.freemud.service;

import org.springframework.stereotype.Service;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: UserServiceImpl
 * @Package com.freemud.service
 * @Description: 用户服务
 * @author: xuebao.hu
 * @date: 2019/1/11 16:46
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
@Service
public class UserServiceImpl extends BaseService{
    public void firstMethod(){
        test3();
        super.test2();
        System.out.println("this is first method!");
    }

    public void test3(){
        System.out.println("this is third method!");
    }
}
