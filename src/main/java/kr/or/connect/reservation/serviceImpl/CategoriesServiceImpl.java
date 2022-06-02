package kr.or.connect.reservation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.connect.reservation.dao.CategoriesDao;
import kr.or.connect.reservation.dto.Categories;
import kr.or.connect.reservation.service.CategotiesService;

@Service
public class CategoriesServiceImpl implements CategotiesService{
	@Autowired
	CategoriesDao categoriesDao;
	
	@Override
	public int categoriesCount() {
		return categoriesDao.selectCountCategories();
	}

	@Override
	public List<Categories.Info> getCategoryList() {
		List<Categories.Info> list = categoriesDao.selectAllCategories();
		
		for(Categories.Info categories : list) {
			int count = categoriesDao.selectCountDisplayInfoByCategoryId(categories.getId());
			categories.setCount(count);
		}
		return list;
	}
}
