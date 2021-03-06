package kr.or.connect.reservation.dto;

import java.util.Date;
import java.util.List;

public class Product {
	public static class Info {
		private int id;
		private int categoryId;
		private int displayInfoId;
		private String name;
		private String description;
		private String content;
		private String event;
		private String openingHours;
		private String placeName;
		private String placeLot;
		private String placeStreet;
		private String tel;
		private String homepage;
		private String emil;
		private Date createDate;
		private Date modifyDate;
		private int fileId;
		@Override
		public String toString() {
			return "Info [id=" + id + ", categoryId=" + categoryId + ", displayInfoId=" + displayInfoId + ", name="
					+ name + ", description=" + description + ", content=" + content + ", event=" + event
					+ ", openingHours=" + openingHours + ", placeName=" + placeName + ", placeLot=" + placeLot
					+ ", placeStreet=" + placeStreet + ", tel=" + tel + ", homepage=" + homepage + ", emil=" + emil
					+ ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", fileId=" + fileId + "]";
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
		public int getDisplayInfoId() {
			return displayInfoId;
		}
		public void setDisplayInfoId(int displayInfoId) {
			this.displayInfoId = displayInfoId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getEvent() {
			return event;
		}
		public void setEvent(String event) {
			this.event = event;
		}
		public String getOpeningHours() {
			return openingHours;
		}
		public void setOpeningHours(String openingHours) {
			this.openingHours = openingHours;
		}
		public String getPlaceName() {
			return placeName;
		}
		public void setPlaceName(String placeName) {
			this.placeName = placeName;
		}
		public String getPlaceLot() {
			return placeLot;
		}
		public void setPlaceLot(String placeLot) {
			this.placeLot = placeLot;
		}
		public String getPlaceStreet() {
			return placeStreet;
		}
		public void setPlaceStreet(String placeStreet) {
			this.placeStreet = placeStreet;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getHomepage() {
			return homepage;
		}
		public void setHomepage(String homepage) {
			this.homepage = homepage;
		}
		public String getEmil() {
			return emil;
		}
		public void setEmil(String emil) {
			this.emil = emil;
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
		public int getFileId() {
			return fileId;
		}
		public void setFileId(int fileId) {
			this.fileId = fileId;
		}
	}
	
	public static class Image {
		private int id;
		private int displayInfoId;
		private int fileId;
		private String fileName;
		private String saveFileName;
		private String contentType;
		private int deleteFlag;
		private Date createDate;
		private Date modifyDate;
		@Override
		public String toString() {
			return "Image [id=" + id + ", displayInfoId=" + displayInfoId + ", fileId=" + fileId + ", fileName="
					+ fileName + ", saveFileName=" + saveFileName + ", contentType=" + contentType + ", deleteFlag="
					+ deleteFlag + ", createDate=" + createDate + ", modifyDate=" + modifyDate + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getDisplayInfoId() {
			return displayInfoId;
		}
		public void setDisplayInfoId(int displayInfoId) {
			this.displayInfoId = displayInfoId;
		}
		public int getFileId() {
			return fileId;
		}
		public void setFileId(int fileId) {
			this.fileId = fileId;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getSaveFileName() {
			return saveFileName;
		}
		public void setSaveFileName(String saveFileName) {
			this.saveFileName = saveFileName;
		}
		public String getContentType() {
			return contentType;
		}
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
		public int getDeleteFlag() {
			return deleteFlag;
		}
		public void setDeleteFlag(int deleteFlag) {
			this.deleteFlag = deleteFlag;
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
	}
	
	public static class Price {
		private int id;
		private int productId;
		private String priceTypeName;
		private int price;
		private int discountRate;
		private Date createDate;
		private Date modifyDate;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getPriceTypeName() {
			return priceTypeName;
		}
		public void setPriceTypeName(String priceTypeName) {
			this.priceTypeName = priceTypeName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getDiscountRate() {
			return discountRate;
		}
		public void setDiscountRate(int discountRate) {
			this.discountRate = discountRate;
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
			return "Price [id=" + id + ", productId=" + productId + ", priceTypeName=" + priceTypeName + ", price="
					+ price + ", discountRate=" + discountRate + ", createDate=" + createDate + ", modifyDate="
					+ modifyDate + "]";
		}
		
	}
	
	
	public static class Result {
		private int totalCount;
		private int productCount;
		private List<Product.Info> products;
		public Result() {
			super();
		}
		public Result(int totalCount, int productCount, List<Info> products) {
			super();
			this.totalCount = totalCount;
			this.productCount = productCount;
			this.products = products;
		}
		@Override
		public String toString() {
			return "Result [totalCount=" + totalCount + ", productCount=" + productCount + ", products=" + products
					+ "]";
		}
		public int getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}
		public int getProductCount() {
			return productCount;
		}
		public void setProductCount(int productCount) {
			this.productCount = productCount;
		}
		public List<Product.Info> getProducts() {
			return products;
		}
		public void setProducts(List<Product.Info> products) {
			this.products = products;
		}
	}
}
