
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.set_id(1);
		product.set_name("Macbook Pro '22");
		product.set_description("Silver Light Dimgray");
		product.set_price(17.800);
		product.set_stockAmount(55);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		
	}

}
