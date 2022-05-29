package kr.or.connect.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kr.or.connect.reservation.dto.Categories;
import kr.or.connect.reservation.service.CategoriesServiceImpl;

@RestController
@RequestMapping(path="/api")
public class CategoriesApiController {
	@Autowired
	CategoriesServiceImpl categoriesServiceImpl;
	
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
}
