package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC kodlar�yla veritaban�na kaydedicez(ilerde)
		System.out.println("�r�n eklendi " + product.name);
	}
	
	public void Add2(int id,String name,String description, int stockAmount, double price, String renk) {
		
	}
}
