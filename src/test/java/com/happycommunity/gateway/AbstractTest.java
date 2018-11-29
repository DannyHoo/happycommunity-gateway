package com.happycommunity.gateway;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * @author Danny
 * @Title: AbstractTest
 * @Description:
 * @Created on 2018-10-26 17:25:14
 */
@ContextConfiguration(locations = { "classpath:/spring/springmvc.xml" })
public class AbstractTest extends AbstractJUnit4SpringContextTests {
}
