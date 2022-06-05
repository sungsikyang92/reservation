package kr.or.connect.reservation.dao.sqls;

public class UserRoleDaoSqls {
	public static final String GET_ALL_BY_EMAIL = "SELECT ur.id, ur.user_id, ur.role_name FROM user_role ur JOIN user u ON ur.user_id = u.id WHERE u.email = :email";
}
