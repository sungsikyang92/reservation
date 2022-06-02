package kr.or.connect.reservation.dto;

import java.util.List;

public class Promotion {
	public static class Info {
		private int id;
		private int productId;
		private int categoryId;
		private String categoryName;
		private String description;
		private int fileId;
		
		@Override
		public String toString() {
			return "Info [id=" + id + ", productId=" + productId + ", categoryId=" + categoryId + ", categoryName="
					+ categoryName + ", description=" + description + ", fileId=" + fileId + "]";
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getFileId() {
			return fileId;
		}
		public void setFileId(int fileId) {
			this.fileId = fileId;
		}
	}
	public static class Result {
		private int size;
		private List<Promotion.Info> items;
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public List<Promotion.Info> getItems() {
			return items;
		}
		public void setItems(List<Promotion.Info> items) {
			this.items = items;
		}
		@Override
		public String toString() {
			return "Result [size=" + size + ", items=" + items + "]";
		}
		public Result(int size, List<Info> items) {
			super();
			this.size = size;
			this.items = items;
		}
		public Result() {
			super();
		}
		
	}
}
