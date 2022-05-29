package kr.or.connect.reservation.controller;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.config.WebMvcContextConfiguration;
import kr.or.connect.reservation.service.CategoriesServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {WebMvcContextConfiguration.class, ApplicationConfig.class})
@WebAppConfiguration
public class CategoriesApiControllerTest {
	
	@InjectMocks
	public CategoriesApiController categoriesApiController;
	
	@Mock
	CategoriesServiceImpl categoriesServiceImpl;
	
	private MockMvc mockMvc;
	
	

}
