package com.freemud.service;

import org.springframework.stereotype.Service;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: BaseService
 * @Package com.freemud.service
 * @Description: 简单描述下这个类是做什么用的
 * @author: xuebao.hu
 * @date: 2019/1/11 16:48
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
@Service
public class BaseService {
    public void test2(){
        System.out.println("this is second time !");
        String methodName = Thread.currentThread().getStackTrace()[0].getMethodName();
        System.out.println(methodName);
        String methodName1 = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(methodName1);
        String methodName2 = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(methodName2);
        String methodName3 = Thread.currentThread().getStackTrace()[3].getMethodName();
        System.out.println(methodName3);

    }
}
