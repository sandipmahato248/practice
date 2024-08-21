package com.sandip.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductExample {
	record Product(Integer id, String name, String category, Integer price) {}
	
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
				new Product(101, "Java", "Book", 150),
				new Product(102, "Spring", "Book", 300),
				new Product(103, "Html", "Book", 100),
				new Product(104, "Css", "Book", 250),
				new Product(105, "Nokia", "Phone", 3000),
				new Product(106, "Samsung", "Phone", 1500),
				new Product(107, "Lenovo", "Phone", 2500)
				);
		
		//get all product that belongs to book and price > 200
		productList.stream().filter(p-> p.category.equalsIgnoreCase("book"))
		.filter(e -> e.price > 200).forEach(System.out::println);
		
		//get cheapest product of phone
		Product pro = productList.stream().filter(p -> p.category.equalsIgnoreCase("phone"))
		.min(Comparator.comparing(Product::price)).get();
		System.out.println(pro);
		System.out.println("=============");
		//first compare with name and then price
		List<Product> pList =productList.stream()
			.sorted(Comparator.comparing(Product::name).thenComparing(Product::price))
			.collect(Collectors.toList());
		System.out.println(pList);
					
	}

}
