package datastructures.search;

public class LinearProductSearchDemo {

	public static Product LinearSearchProductById(Product[] products, double searchid) {

		for (Product product : products) {
			if (product.getId() == searchid) {

				return product;
			}
		}
		return null;
	}

	public static void main(String[] args) {

		Product[] products = { 
				new Product(1, "Desktop", 94000.00), 
				new Product(2, "Desktop", 34000.00),
				new Product(3, "Tab", 450000.00), 
				new Product(4, "Smart Tv", 45000.00),
				new Product(5, "Speakers ", 50000)

		};

		int searchid = 3;
		Product result = LinearSearchProductById(products, searchid);
		if (result != null) {
			System.out.println("product found :" + result);

		} else {
			System.out.println("product with Id : " + searchid + "not found");
		}
	}

}
