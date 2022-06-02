package kr.or.connect.reservation.dao.sqls;

public class ProductDaoSqls {
	public static final String GET_TOTAL_CATEGORY_COUNT = 
			"SELECT COUNT(*) FROM product, display_info "
			+ "WHERE category_id = :categoryId and product.id = display_info.product_id";
	public static final String GET_ALL_CATEGORY_COUNT = 
			"SELECT count(*) FROM product, display_info "
			+ "WHERE product.id = display_info.product_id";
	public static final String GET_PRODUCTS_BY_CATEGORY_ID =
			"SELECT p.id, category_id, display_info_id, name, description, "
			+ "content, event, opening_hours, place_name, place_lot, "
			+ "place_street, tel, homepage, email, p.create_date, "
			+ "p.modify_date, pi.file_id FROM category c, product p, "
			+ "display_info di, display_info_image dii, product_image pi "
			+ "WHERE category_id = :categoryId AND c.id = category_id "
			+ "AND p.id = di.product_id AND di.id = display_info_id AND p.id = pi.product_id "
			+ "LIMIT :start, :limit";
	public static final String GET_ALL_PRODUCT =
			"select p.id, category_id, dii.display_info_id, c.name, "
			+ "description, content, event, di.opening_hours, di.place_name, "
			+ "di.place_lot, di.place_street, di.tel, di.homepage, di.email, "
			+ "di.create_date, di.modify_date, dii.file_id "
			+ "from product p , category c, display_info di, display_info_image dii "
			+ "where c.id = category_id AND p.id = product_id "
			+ "AND di.id = display_info_id LIMIT :start, :limit";
}
