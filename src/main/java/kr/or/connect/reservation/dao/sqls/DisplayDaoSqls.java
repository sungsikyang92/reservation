package kr.or.connect.reservation.dao.sqls;

public class DisplayDaoSqls {
	public static final String GET_PRODUCT = 
			"SELECT di.id id, p.category_id category_id, dii.display_info_id display_info_id, c.name name, "
			+ "p.description description, p.content content, p.event event, di.opening_hours opening_hours, "
			+ "di.place_name place_name, di.place_lot place_lot, di.place_street place_street, di.tel tel, "
			+ "di.homepage homepage, di.email email, di.create_date create_date, di.modify_date modify_date, "
			+ "pimg.file_id file_id "
			+ "FROM display_info di, product p, display_info_image dii, category c, product_image pimg "
			+ "WHERE di.product_id = :productId AND p.category_id = c.id AND p.id = di.product_id "
			+ "AND di.id = dii.display_info_id AND pimg.product_id = p.id AND pimg.type = :type";
	
	public static final String GET_PRODUCT_IMAGES = 
			"SELECT pimg.product_id product_id, pimg.id product_image_id, pimg.type type, fi.id file_info_id, "
			+ "fi.file_name file_name, fi.save_file_name save_file_name, fi.content_type content_type, "
			+ "fi.delete_flag delete_flag, fi.create_date create_date, fi.modify_date modify_datge "
			+ "FROM product_image pimg, file_info fi "
			+ "WHERE pimg.file_id = fi.id AND pimg.product_id = :productId AND pimg.type = :type";

	
	public static final String GET_DISPLAY_INFO_IMAGES = 
			"SELECT dii.id id, dii.display_info_id display_info_id, dii.file_id file_id, fi.file_name file_name, "
			+ "fi.save_file_name save_file_name, fi.content_type content_type, fi.delete_flag delete_flag, "
			+ "fi.create_date create_date, fi.modify_date modify_date "
			+ "FROM display_info_image dii, file_info fi "
			+ "WHERE dii.file_id = fi.id AND dii.id = :displayInfoId";
	
	public static final String GET_AVGSCORE = 
			"SELECT IFNULL(AVG(score), 0) "
			+ "FROM product p, display_info di, reservation_user_comment ruc "
			+ "WHERE p.id = di.product_id AND p.id = ruc.product_id AND di.id=:displayInfoId";
	
	public static final String GET_PRODUCT_PRICES = 
			"SELECT id, product_id, price_type_name, price, discount_rate, create_date, modify_date "
			+ "FROM product_price pp "
			+ "WHERE product_id = :productId ORDER BY price ASC";
	
}
