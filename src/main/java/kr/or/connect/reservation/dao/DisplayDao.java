package kr.or.connect.reservation.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reservation.dto.Display;
import kr.or.connect.reservation.dto.Product;

import static kr.or.connect.reservation.dao.sqls.DisplayDaoSqls.*;

@Repository
public class DisplayDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Product.Info> prodInfoRowMapper = BeanPropertyRowMapper.newInstance(Product.Info.class);
	private RowMapper<Product.Image> prodImgRowMapper = BeanPropertyRowMapper.newInstance(Product.Image.class);
	private RowMapper<Display.InfoImage> disInfoImgRowMapper = BeanPropertyRowMapper.newInstance(Display.InfoImage.class);
	private RowMapper<Product.Price> prodPriceMapper = BeanPropertyRowMapper.newInstance(Product.Price.class);
	
	public DisplayDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Product.Info> getProductById(int productId, String type) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("productId", productId);
		params.put("type", type);
		
		return jdbc.query(GET_PRODUCT, params, prodInfoRowMapper);
	}
	
	public List<Product.Image> getProductImageById(int productId, String type) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("productId", productId);
		params.put("type", type);
		
		return jdbc.query(GET_PRODUCT_IMAGES, params, prodImgRowMapper);
	}
	
	public int getAvgScore(int displayInfoId) {
		Map<String, Integer> params = Collections.singletonMap("displayInfoId", displayInfoId);
		
		return jdbc.queryForObject(GET_AVGSCORE, params, Integer.class);
	}
	
	public List<Display.InfoImage> getDisplayInfoImageById(int displayInfoId) {
		Map<String, Integer> params = Collections.singletonMap("displayInfoId", displayInfoId);
		
		return jdbc.query(GET_DISPLAY_INFO_IMAGES, params, disInfoImgRowMapper);
	}
	
	public List<Product.Price> getProductPriceById(int productId) {
		Map<String, Integer> params = Collections.singletonMap("productId", productId);
		
		return jdbc.query(GET_PRODUCT_PRICES, params, prodPriceMapper);
	}
	
}
