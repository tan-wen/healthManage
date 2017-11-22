package com.aoyang.health.admin;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:spring/spring-mvc.xml"
		,"classpath:spring/spring-mybatis.xml"
		,"classpath:spring/spring-redis.xml"
		,"classpath:spring/spring-quartz.xml"})
public class BaseJunit4Test {

}