package kr.or.connect.reservation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.connect.reservation.dao.DisplayDao;
import kr.or.connect.reservation.dto.Display.InfoImage;
import kr.or.connect.reservation.dto.Product.Image;
import kr.or.connect.reservation.dto.Product.Info;
import kr.or.connect.reservation.dto.Product.Price;
import kr.or.connect.reservation.service.DisplayService;

@Service
public class DisplayServiceImpl implements DisplayService{

	@Autowired
	DisplayDao displayDao;
	private static final String TYPE = "ma";
	
	@Override
	public List<Info> getProductById(int productId) {
		return displayDao.getProductById(productId, TYPE);
	}

	@Override
	public List<Image> getProductImageById(int productId) {
		return displayDao.getProductImageById(productId, TYPE);
	}

	@Override
	public int getAvgScore(int displayInfoId) {
		return displayDao.getAvgScore(displayInfoId);
	}

	@Override
	public List<InfoImage> getDisplayInfoImageById(int displayInfoId) {
		return displayDao.getDisplayInfoImageById(displayInfoId);
	}

	@Override
	public List<Price> getProductPriceById(int productId) {
		return displayDao.getProductPriceById(productId);
	}
}
