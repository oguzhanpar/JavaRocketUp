
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.name = "Iphone 14 128 GB Silver";
		product.price = 45.987;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		

	}

}
