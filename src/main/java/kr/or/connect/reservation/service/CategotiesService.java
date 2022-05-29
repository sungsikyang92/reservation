package kr.or.connect.reservation.service;

import java.util.List;

import kr.or.connect.reservation.dto.Categories;

public interface CategotiesService {
	
	public int categoriesCount();
	
	public List<Categories.Info> getCategoryList();

}
