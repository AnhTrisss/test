package com.jewelry_store.jewelry_store.service.impl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import com.jewelry_store.jewelry_store.dto.ProductDTO;
import com.jewelry_store.jewelry_store.entity.Product;
import com.jewelry_store.jewelry_store.repository.ProductRepository;
import com.jewelry_store.jewelry_store.service.ProductService;
import java.util.Objects;

public class ProductImpl implements ProductService{
    @Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

    
//=============================================================
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}


//=============================================================
	@Override
	public Product getProductById(int id) {
		Product product = productRepository.findById(id).orElse(null);
		return product;
	}

//=============================================================
@Override
public Product updateProduct(ProductDTO product) {
    Product dbProduct = productRepository.findById(product.getProductId
	()).orElse(null);

    if (dbProduct == null) {
        return null;
    }

    dbProduct.setImageId(product.getImageId());
    dbProduct.setIsActive(product.getIsActive());

    Product updateProduct = productRepository.save(dbProduct);

    return updateProduct;
}


//=============================================================
@Override
	public Boolean deleteProduct(int id) {
		Product product = productRepository.findById(id).orElse(null);

		if (!ObjectUtils.isEmpty(product)) {
			productRepository.delete(product);
			return true;
		}
		return false;
	}

//=============================================================
	@Override
	public List<Product> getAllActiveProducts(String type) {
		List<Product> products = null;
		if (ObjectUtils.isEmpty(type)) {
			products = productRepository.findByIsActiveTrue();
		}

		return products;
	}

	//=============================================================
	@Override
	public List<Product> getAllActiveDiamond(int diamondTypeId) {
		List<Product> products = null;
		if (ObjectUtils.isEmpty(diamondTypeId)) {
			products = productRepository.findByIsActiveTrue();
		}else {
			products=productRepository.findByDiamondType();
		}

		return products;
	}

	//=============================================================
	@Override
	public List<Product> getAllActiveGold(int goldTypeId) {
		List<Product> products = null;
		if (ObjectUtils.isEmpty(goldTypeId)) {
			products = productRepository.findByIsActiveTrue();
		}else {
			products=productRepository.findByGoldType();
		}

		return products;
	}
}
