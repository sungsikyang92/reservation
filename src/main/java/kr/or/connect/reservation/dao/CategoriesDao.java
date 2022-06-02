package kr.or.connect.reservation.dao;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reservation.dto.Categories;
import static kr.or.connect.reservation.dao.sqls.CategoriesDaoSqls.*;

@Repository
public class CategoriesDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Categories.Info> rowMapper = BeanPropertyRowMapper.newInstance(Categories.Info.class);
	
	public CategoriesDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Categories.Info> selectAllCategories() {
		return jdbc.query(SELECT_CATEGORIES, EmptySqlParameterSource.INSTANCE, rowMapper);
	}
	
	public int selectCountCategories() {
		return jdbc.queryForObject(SELECT_COUNT_CATEGORY, EmptySqlParameterSource.INSTANCE, Integer.class);
	}
	
	public int selectCountDisplayInfoByCategoryId(int id) {
		Map<String, Integer> params = Collections.singletonMap("id", id);
		return jdbc.queryForObject(SELECT_COUNT_DISPLAY_INFO_BY_CATEGORY_ID, params, Integer.class);
	}
}


//String SELECT_COUNT_DISPLAY_INFO_BY_CATEGORY_ID = "SELECT COUNT(*) FROM display_info d JOIN product p ON p.id = product_id WHERE category_id = :categoryId";