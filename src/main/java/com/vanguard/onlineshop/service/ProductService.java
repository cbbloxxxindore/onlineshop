package com.vanguard.onlineshop.service;

import com.vanguard.onlineshop.models.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);
    List<Product>getAllproduct();
}
