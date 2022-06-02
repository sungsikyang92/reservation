package kr.or.connect.reservation.dao.sqls;

public class PromotionDaoSqls {
	public static final String GET_PROMOTION_COUNT = "SELECT COUNT(*) FROM promotion";
	public static final String GET_PROMOTION_INFO = 
			
//			"SELECT prom.id, prod.id product_id, c.id category_id, name category_name, description, file_id "
//					+ "FROM category c, product prod, promotion prom, product_image proimg "
//					+ "WHERE c.id = category_id AND prod.id = prom.product_id AND prod.id = proimg.product_id AND type=:type";
	
//			"SELECT pm.id, pi.product_id product_id, p.category_id, c.name category_name, p.description, file_id "
//			+ "FROM product_image pi, product p, category c, promotion pm "
//			+ "WHERE type = :type AND product_id = p.id AND p.category_id = c.id AND pm.product_id = p.id";
	
	"SELECT pm.id, pimg.product_id, p.category_id, c.name category_name, p.description, file_id FROM product_image pimg, product p, category c, promotion pm WHERE type = :type AND pimg.product_id = p.id AND p.category_id = c.id AND pm.product_id = p.id";

}
