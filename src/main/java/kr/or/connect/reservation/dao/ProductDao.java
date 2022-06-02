package kr.or.connect.reservation.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reservation.dto.Product;
import static kr.or.connect.reservation.dao.sqls.ProductDaoSqls.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Product.Info> rowMapper = BeanPropertyRowMapper.newInstance(Product.Info.class);
	
	public ProductDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public int getTotalCategoryCount(int categoryId) {
		Map<String, Integer> params = Collections.singletonMap("categoryId", categoryId);
		return jdbc.queryForObject(GET_TOTAL_CATEGORY_COUNT, params, Integer.class);
	}
	
	public int getAllCategoryCount() {
		return jdbc.queryForObject(GET_ALL_CATEGORY_COUNT, EmptySqlParameterSource.INSTANCE, Integer.class);
	}
	
	public List<Product.Info> getProductsByCategoryId(int categoryId, int start, int limit) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("categoryId", categoryId);
		params.put("start", start);
		params.put("limit", limit);
		
		return jdbc.query(GET_PRODUCTS_BY_CATEGORY_ID, params, rowMapper);
	}
	
	public List<Product.Info> getAllProductList(int start, int limit){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("start", start);
		params.put("limit", limit);
		
		return jdbc.query(GET_ALL_PRODUCT, params, rowMapper);
	}
}
