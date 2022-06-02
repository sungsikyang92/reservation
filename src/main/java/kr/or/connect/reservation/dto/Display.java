package kr.or.connect.reservation.dto;

import java.util.Date;
import java.util.List;

import kr.or.connect.reservation.dto.Product.Image;
import kr.or.connect.reservation.dto.Product.Info;
import kr.or.connect.reservation.dto.Product.Price;

public class Display {
	public static class InfoImage {
		private int id;
		private int displayInfoId;
		private int fileId;
		private String fileName;
		private String saveFileName;
		private String contentType;
		private int deleteFlag;
		private Date createDate;
		private Date modifyDate;
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
		@Override
		public String toString() {
			return "InfoImage [id=" + id + ", displayInfoId=" + displayInfoId + ", fileId=" + fileId + ", fileName="
					+ fileName + ", saveFileName=" + saveFileName + ", contentType=" + contentType + ", deleteFlag="
					+ deleteFlag + ", createDate=" + createDate + ", modifyDate=" + modifyDate + "]";
		}
	}
	
	public static class Result {
		private List<Product.Info> product;
		private List<Product.Image> productImages;
		private List<Display.InfoImage> displayInfoImages;
		private int avgScore;
		private List<Product.Price> productPrices;
		
		public List<Product.Info> getProduct() {
			return product;
		}
		public void setProduct(List<Product.Info> product) {
			this.product = product;
		}
		public List<Product.Image> getProductImages() {
			return productImages;
		}
		public void setProductImages(List<Product.Image> productImages) {
			this.productImages = productImages;
		}
		public List<Display.InfoImage> getDisplayInfoImages() {
			return displayInfoImages;
		}
		public void setDisplayInfoImages(List<Display.InfoImage> displayInfoImages) {
			this.displayInfoImages = displayInfoImages;
		}
		public int getAvgScore() {
			return avgScore;
		}
		public void setAvgScore(int avgScore) {
			this.avgScore = avgScore;
		}
		public List<Product.Price> getProductPrices() {
			return productPrices;
		}
		public void setProductPrices(List<Product.Price> productPrices) {
			this.productPrices = productPrices;
		}
		@Override
		public String toString() {
			return "Result [product=" + product + ", productImages=" + productImages + ", displayInfoImages="
					+ displayInfoImages + ", avgScore=" + avgScore + ", productPrices=" + productPrices + "]";
		}
		public Result(List<Info> product, List<Image> productImages, List<InfoImage> displayInfoImages, int avgScore,
				List<Price> productPrices) {
			super();
			this.product = product;
			this.productImages = productImages;
			this.displayInfoImages = displayInfoImages;
			this.avgScore = avgScore;
			this.productPrices = productPrices;
		}
		public Result() {
			super();
		}
		
	}
}
