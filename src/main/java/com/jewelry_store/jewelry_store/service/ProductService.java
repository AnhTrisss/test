package com.jewelry_store.jewelry_store.service;

import java.util.List;

import com.jewelry_store.jewelry_store.dto.ProductDTO;
import com.jewelry_store.jewelry_store.entity.Product;

public interface ProductService {
    
    public Product saveProduct(Product product);
	public List<Product> getAllProducts();
	public Boolean deleteProduct(int id);
	public Product getProductById(int id);
	public Product updateProduct(ProductDTO product);
	public List<Product> getAllActiveProducts(String type);
	public List<Product> getAllActiveGold(int goldTypeId);
	public List<Product> getAllActiveDiamond(int diamondTypeId);

}
