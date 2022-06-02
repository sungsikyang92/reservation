package kr.or.connect.reservation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.connect.reservation.dao.ProductDao;
import kr.or.connect.reservation.dto.Product;
import kr.or.connect.reservation.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productDao;
	private static final int LIMIT = 4;
	
	@Override
	public int getProductCategoryCount(int categoryId) {
		int count;
		if(categoryId == 0) {
			count = productDao.getAllCategoryCount();
		} else {
			count = productDao.getTotalCategoryCount(categoryId);
		}
		return count;
	}
	
	@Override
	public List<Product.Info> getProductList(int categoryId, int start) {
		List<Product.Info> list;
		if(categoryId == 0) {
			list = productDao.getAllProductList(start, LIMIT);
		} else {
			list = productDao.getProductsByCategoryId(categoryId, start, LIMIT);
		}
		return list;
	}

}
