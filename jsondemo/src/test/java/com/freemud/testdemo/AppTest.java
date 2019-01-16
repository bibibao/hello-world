package com.freemud.testdemo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.freemud.enums.PropertyEnum;
import com.freemud.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: AppTest
 * @Package com.freemud.testdemo
 * @Description: 简单描述下这个类是做什么用的
 * @author: xuebao.hu
 * @date: 2019/1/11 15:38
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class AppTest extends BaseTest{
    @Autowired
    UserServiceImpl userService;
    @Test
    public void test1(){
//        userService.firstMethod();
        Class<AppTest> appTestClass = AppTest.class;
        Method[] methods = appTestClass.getMethods();
        System.out.println(methods[0].getName());
        System.out.println(methods[1].getName());
        System.out.println(methods[2].getName());
        System.out.println(methods[3].getName());
    }
    @Test
    public void test2(){
        System.out.println(String.valueOf(UUID.randomUUID()));
    }
    @Test
    public void test3(){
        HashMap<PropertyEnum, Object> map = new HashMap<>();
        map.put(PropertyEnum.USER,"testUser!");
        map.put(PropertyEnum.CUSTOMER,"testCustomer!");
        System.out.println(JSONObject.toJSON(map));
    }
    @Test
    public void test4(){
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        System.out.println(JSON.toJSONString(list));
    }
}
