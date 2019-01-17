package com.kd.threads.forkAndJoin.products;

import java.util.ArrayList;
import java.util.List;

public class ProductListGenerator {

	public List<Product> generate(int size) {

		List<Product> ret = new ArrayList<Product>();
		Product product = null;
		for (int i = 0; i < size; i++) {
			product = new Product();
			product.setName("Product " + 1);
			product.setPrice(10);
			ret.add(product);
		}
		return ret;
	}

}
