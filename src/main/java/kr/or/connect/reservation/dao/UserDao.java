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

import kr.or.connect.reservation.dto.User;
import static kr.or.connect.reservation.dao.sqls.UserDaoSqls.*;

@Repository
public class UserDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<User.Info> userRowMapper = BeanPropertyRowMapper.newInstance(User.Info.class);
	

	public UserDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public User.Info getAllByEmail(String email){
		Map<String, Object> params = Collections.singletonMap("email", email);
		return jdbc.queryForObject(GET_ALL_BY_EMAIL, params, userRowMapper);
	}
	
	public User.Info getUserByEmail(String email) {
		Map<String, Object> params = Collections.singletonMap("email", email);
		return jdbc.queryForObject(GET_ALL_BY_EMAIL, params, userRowMapper);
	}
	


}
