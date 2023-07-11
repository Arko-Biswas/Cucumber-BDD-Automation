package amazonImplementation;

import java.util.*;

public class AmazonImplementation {
	
	
	private String productName;
	private int productPrice;
	
	public AmazonImplementation(String productName, int productPrice) {
		
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public List<String> getProductList(){
		
		List<String> productList = new ArrayList<>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple MacBook Air M2");
		productList.add("Apple iPad Pro M2");
		return productList;
		
	}
	
	

}
