package kr.or.connect.reservation.dto;

import java.util.List;

public class Categories {
	public static class Info {
		private int id;
		private String name;
		private int count;
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
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		@Override
		public String toString() {
			return "Info [id=" + id + ", name=" + name + ", count=" + count + "]";
		}
		
	}
	public static class Result {
		private int size;
		private List<Categories.Info> items;
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public List<Categories.Info> getItems() {
			return items;
		}
		public void setItems(List<Categories.Info> items) {
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
