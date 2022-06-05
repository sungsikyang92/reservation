package kr.or.connect.reservation.service;

import java.util.List;

import kr.or.connect.reservation.service.security.UserDbService;
import kr.or.connect.reservation.service.security.UserEntity;
import kr.or.connect.reservation.service.security.UserRoleEntity;

public interface UserService extends UserDbService{
//	int getUserId(String loginUserId);

	List<UserRoleEntity> getUserRoles(String loginUserId);

	UserEntity getUser(String loginUserId);
}
