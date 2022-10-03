
public class ProductManager {

	public void add(Product product) {
		
		
		//Both constructor works
//		ProductValidator productValidator = new ProductValidator();
//		
//		if(productValidator.isValid(product)) {
//			
//			System.out.println(product.name + " - Product Saved !");
//			
//		}else {
//			
//			System.out.println(product.name + " - Product Details is not valid !");
//		}
		
		//Only static constructor works
		
		if(ProductValidator.isValid(product)) {
			
			DatabaseHelper.Connection.createConnection();
			DatabaseHelper.Crud.add();
			
			System.out.println(product.name + " - Product Saved !");
			
		}else {
			
			System.out.println(product.name + " - Product Details is not valid !");
		}
		
		
	}

}
