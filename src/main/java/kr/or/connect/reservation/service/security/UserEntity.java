package kr.or.connect.reservation.service.security;

public class UserEntity {
	private String loginUserId;
	private String password;
	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserEntity(String loginUserId, String password) {
		super();
		this.loginUserId = loginUserId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserEntity [loginUserId=" + loginUserId + ", password=" + password + "]";
	}
	
	
}
