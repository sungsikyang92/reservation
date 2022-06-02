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

import kr.or.connect.reservation.dto.Promotion;
import static kr.or.connect.reservation.dao.sqls.PromotionDaoSqls.*;

@Repository
public class PromotionDao {
	 private NamedParameterJdbcTemplate jdbc;
	 private RowMapper<Promotion.Info> rowMapper = BeanPropertyRowMapper.newInstance(Promotion.Info.class);
	 
	 public PromotionDao(DataSource dataSource) {
		 this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	 }
	 
	 public List<Promotion.Info> getAllPromotion(String type){
		 Map<String, String> params = Collections.singletonMap("type", type);
		 return jdbc.query(GET_PROMOTION_INFO, params, rowMapper);
	 }
	 
	 public int getPromotionCount() {
		 return jdbc.queryForObject(GET_PROMOTION_COUNT, EmptySqlParameterSource.INSTANCE, Integer.class);
	 }
}
