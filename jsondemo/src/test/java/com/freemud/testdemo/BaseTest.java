package com.freemud.testdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: BaseTest
 * @Package com.freemud.testdemo
 * @Description: 简单描述下这个类是做什么用的
 * @author: xuebao.hu
 * @date: 2019/1/11 15:26
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目的
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BaseTest {
    @Before
    public void init(){
        System.out.println("测试开始...");
    }
    @After
    public void after(){
        System.out.println("测试结束...");
    }

}
