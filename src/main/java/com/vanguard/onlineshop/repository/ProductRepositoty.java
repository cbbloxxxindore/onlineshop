package com.vanguard.onlineshop.repository;

import com.vanguard.onlineshop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoty extends JpaRepository<Product,Integer> {

}
