
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.id = 1;
		product.name = "Macbook Pro '22";
		product.description = "Silver Light Dimgray";
		product.price = 17.890;
		product.stockAmount = 55;
		

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		
	}

}
