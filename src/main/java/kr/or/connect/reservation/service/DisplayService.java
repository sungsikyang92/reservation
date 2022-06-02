package kr.or.connect.reservation.service;

import java.util.List;

import kr.or.connect.reservation.dto.Display;
import kr.or.connect.reservation.dto.Product;

public interface DisplayService {
	public List<Product.Info> getProductById(int productId);
	public List<Product.Image> getProductImageById(int productId);
	public int getAvgScore(int displayInfoId);
	public List<Display.InfoImage> getDisplayInfoImageById(int displayInfoId);
	public List<Product.Price> getProductPriceById(int productId);
}
