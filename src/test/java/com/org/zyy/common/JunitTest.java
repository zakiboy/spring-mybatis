package com.org.zyy.common;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-appliction.xml"})//需要加载多个配置文件时，大括号内","分割配置文件
public class JunitTest extends AbstractJUnit4SpringContextTests {

}
