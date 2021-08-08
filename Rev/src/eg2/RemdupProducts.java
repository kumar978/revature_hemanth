package eg2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemdupProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> prod=new LinkedHashSet<>();
		prod.add(new Product(16, "ABC", 50f, 2.4f, 4f));
		prod.add(new Product(11, "ABC", 25f, 3.2f, 2.5f));
		prod.add(new Product(12, "xyz", 30.5f, 4.0f, 2f));
		prod.add(new Product(13, "pqr", 40.7f, 3.0f, 5.3f));
		prod.add(new Product(16, "ABC", 50f, 2.4f, 4f));
		prod.add(new Product(11, "ABC", 25f, 3.2f, 2.5f));
		prod.add(new Product(18, "pqr", 45.3f, 2.6f, 3f));
		prod.add(new Product(13, "pqr", 40.7f, 3.0f, 5.3f));
		prod.add(new Product(13, "pqr", 40.7f, 3.0f, 5.3f));
		prod.add(new Product(11, "ABC", 25f, 3.2f, 2.5f));
		
	}
	public void removeduplicates(Set set){
		
	}

}
