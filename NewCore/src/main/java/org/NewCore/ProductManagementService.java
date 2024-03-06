package org.NewCore;

import java.util.List;

public interface ProductManagementService {
	List<DefaultProduct> getProducts();

	Product getProductById(int productIdToAddToCart);
}
