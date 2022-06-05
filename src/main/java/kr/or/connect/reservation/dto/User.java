package kr.or.connect.reservation.dto;

import java.util.Date;

public class User {
	public static class Info {
		private int id;
		private String name;
		private String password;
		private String email;
		private String phone;
		private Date createDate;
		private Date modifyDate;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Date getCreateDate() {
			return createDate;
		}

		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}

		public Date getModifyDate() {
			return modifyDate;
		}

		public void setModifyDate(Date modifyDate) {
			this.modifyDate = modifyDate;
		}

		@Override
		public String toString() {
			return "Info [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", phone="
					+ phone + ", createDate=" + createDate + ", modifyDate=" + modifyDate + "]";
		}
	}

	public static class Role {
		private int id;
		private int userId;
		private String roleName;

		@Override
		public String toString() {
			return "Role [id=" + id + ", userId=" + userId + ", roleName=" + roleName + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
	}
}
