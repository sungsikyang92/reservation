package kr.or.connect.reservation.dao.sqls;

public class CategoriesDaoSqls {
	public static final String SELECT_CATEGORIES = "SELECT id, name FROM category";
	public static final String SELECT_COUNT_CATEGORY = "SELECT COUNT(*) FROM category";
	public static final String SELECT_COUNT_DISPLAY_INFO_BY_CATEGORY_ID = "SELECT COUNT(*) FROM display_info d JOIN product p ON p.id = product_id WHERE category_id = :id";
}
