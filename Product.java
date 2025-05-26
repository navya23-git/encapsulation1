package com.product;
import com.manufacturer.Manufacturer;
	public class Product {
		private String productName;
		private String category;
		private Manufacturer manufacturer;
		private double price;
		private Product(String productName,String category,Manufacturer manufacturer,double price) {
			this.productName=productName;
			this.category=category;
			this.manufacturer=manufacturer;
			this.price=price;
		}
		public String getProductName() {
			return productName;
		}
		public String getCategory() {
			return category;
		}
		public Manufacturer getManufacturer() {
			return manufacturer ;
		}
		public double getPrice() {
			return price;
		}
		public void setProductName(String productName) {
			this.productName=productName;
		}
		public void setCategory(String category) {
			this.category=category;
		}
		public void setManufacturer(Manufacturer manufacturer) {
			this.manufacturer=manufacturer;
		}
		public void setPrice(double price) {
			this.price=price;
		}
		
		public String toString() {
			return "productName:"+productName+"\ncategory:"+category+"\nManufacturer:"+manufacturer+"\nprice:"+price;
		}
		public static Product getProductObject(String productName,String category,Manufacturer manufacturer,double price) {
			if(price>0 ||manufacturer==null) {
			return null;	
			}
			return new Product(productName,category, manufacturer,price);
		}

		}


