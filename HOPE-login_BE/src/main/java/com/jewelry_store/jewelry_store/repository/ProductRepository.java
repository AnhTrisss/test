package com.jewelry_store.jewelry_store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.jewelry_store.jewelry_store.entity.Product;

@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    List<Product> findByIsActiveTrue();
    List<Product> findAllActiveProductsByType(String type);
    List<Product> findByGoldType();
    List<Product> findByDiamondType();
}
