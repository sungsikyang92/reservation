package kr.or.connect.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kr.or.connect.reservation.dto.Categories;
import kr.or.connect.reservation.dto.Product;
import kr.or.connect.reservation.dto.Promotion;
import kr.or.connect.reservation.serviceImpl.CategoriesServiceImpl;
import kr.or.connect.reservation.serviceImpl.ProductServiceImpl;
import kr.or.connect.reservation.serviceImpl.PromotionServiceImpl;

@RestController
@RequestMapping(path="/api")
public class CategoriesApiController {
	@Autowired
	CategoriesServiceImpl categoriesServiceImpl;
	@Autowired
	ProductServiceImpl productServiceImpl;
	@Autowired
	PromotionServiceImpl promotionServiceImpl;
	
	@ApiOperation(value = "카테고리 목록 구하기")
	@ApiResponses({
		@ApiResponse(code = 200, message = "OK"),
		@ApiResponse(code = 500, message = "Exception")
	})
	@GetMapping("/categories")
	public Categories.Result categoryList() {
		int size = categoriesServiceImpl.categoriesCount();
		List<Categories.Info> items = categoriesServiceImpl.getCategoryList();
		
		Categories.Result cateResult = new Categories.Result(size, items);
		return cateResult;
	}
	
	@ApiOperation(value = "전시 정보 구하기")
	@ApiResponses({
		@ApiResponse(code = 200, message = "ok"),
		@ApiResponse(code = 500, message = "Exception")
	})
	@GetMapping("/displayinfos")
	public Product.Result productList(@RequestParam(defaultValue = "0") int categoryId, 
			@RequestParam(defaultValue = "0") int start) {
		List<Product.Info> productList = productServiceImpl.getProductList(categoryId, start);
		int totalCount = productServiceImpl.getProductCategoryCount(categoryId);
		int productCount = productList.size();
		
		Product.Result productResult = new Product.Result(totalCount, productCount, productList);
		return productResult;
	}
	
	@ApiOperation(value = "프로모션 목록 구하기")
	@ApiResponses({
		@ApiResponse(code = 200, message = "ok"),
		@ApiResponse(code = 500, message = "Exception")
	})
	@GetMapping("/promotions")
	public Promotion.Result promotionList() {
		int size = promotionServiceImpl.getPromotionCount();
		List<Promotion.Info> items = promotionServiceImpl.getAllPromotion();
		
		Promotion.Result promotionResult = new Promotion.Result(size, items);
		return promotionResult;
	}
}
