package kr.or.connect.reservation.service;

import java.util.List;

import kr.or.connect.reservation.dto.Product;

public interface ProductService {
	public int getProductCategoryCount(int categoryId);
	public List<Product.Info> getProductList(int categoryId, int start);
		
}
