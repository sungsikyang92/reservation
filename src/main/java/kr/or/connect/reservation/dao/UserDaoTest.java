package kr.or.connect.reservation.dao;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.dto.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class UserDaoTest {
	@Autowired
	DataSource dataSource;
	
	@Autowired
	UserDao	userDao;
	
	@Autowired
	UserRoleDao userRoleDao;
	
	@Test
	public void configTest() throws Exception{
		
	}
	
	@Test
	public void connectionTest() throws Exception{
		Connection con = dataSource.getConnection();
		Assert.assertNotNull(con);
	}
	
	@Test
	public void getUser() throws Exception{
		User.Info user = userDao.getUserByEmail("carami@connect.co.kr");
		Assert.assertNotNull(user);
		Assert.assertEquals("강경미", user.getName());
	}
}
