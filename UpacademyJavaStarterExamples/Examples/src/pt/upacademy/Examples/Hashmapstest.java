package pt.upacademy.Examples;

import java.util.HashMap;
import java.util.Map;

public class Hashmapstest {
	Map<Long,Product>myMap = new HashMap<Long,Product>();

	public static void main(String[] args) {
//		Hasgmaptest myapp = new Hasgmaptest();
//		Product p1= new Product("cola");
//		System.out.println(p1);
//		
//		myMap.put(p1.getId(),p1);
	}

}
class Product{
	static long count=1;
	private long id;
	private String name;
	
	public Product(String name) {
		this.name=name;
		this.id= count++;
	}
	
}
