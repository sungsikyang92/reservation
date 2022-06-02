package kr.or.connect.reservation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.connect.reservation.dao.PromotionDao;
import kr.or.connect.reservation.dto.Promotion;
import kr.or.connect.reservation.service.PromotionService;

@Service
public class PromotionServiceImpl implements PromotionService{
	@Autowired
	PromotionDao promotionDao;
	private static final String TYPE = "ma";

	@Override
	public int getPromotionCount() {
		return promotionDao.getPromotionCount();
	}

	@Override
	public List<Promotion.Info> getAllPromotion() {
		List<Promotion.Info> list = promotionDao.getAllPromotion(TYPE);
		return list;
	}
	
}
