package datastructures.search;

import java.util.Scanner;
public class BinaryProductSearch {

	public static Product BinarySearchById(Product[] products,int id) {
		int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (products[mid].getId() == id) {
                return products[mid];
            }
            if (products[mid].getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product[] products = {
				new Product(1,"Laptop",89000.00),
				new Product(2,"Desktop",45000.00),
				new Product(3,"Tv",80000.00),
				new Product(4,"AC",75000.00),
				new Product(5,"Phone",55000.00),
		};
		System.out.print("Enter product id to search : ");
		int searchid=sc.nextInt();
		Product result = BinarySearchById(products,searchid);
		if(result==null) {
			System.out.println("Product not found");
		}else {
			System.out.println("Product found: "+result);
		}
		
	}
	
}