package entities;

import java.util.List;
import java.util.function.Predicate;

public class ProductServices {
	
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {// MELHORIA - PREDICATE USANDO O CRITETERIA
		double sum = 0.0;
		for(Product p : list) {
			if(criteria.test(p)) {//MELHORIA
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
