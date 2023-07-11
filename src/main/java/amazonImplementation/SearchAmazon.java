package amazonImplementation;

public class SearchAmazon {
	
	public String displayProduct(AmazonImplementation AmazonImplementation_object) {
		
		if(AmazonImplementation_object.getProductList().contains(AmazonImplementation_object.getProductName())) {
			
			String found = ">>> Product found: " + AmazonImplementation_object.getProductName();
			return found;
			
		}
		
		String notFound = "XXX Product Not Found!!";
		return notFound;
		
	}

}
