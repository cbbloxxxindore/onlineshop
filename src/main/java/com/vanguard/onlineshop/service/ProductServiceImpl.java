package com.vanguard.onlineshop.service;

import com.vanguard.onlineshop.models.Product;
import com.vanguard.onlineshop.repository.ProductRepositoty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepositoty productRepositoty;

    public ProductServiceImpl(ProductRepositoty productRepositoty) {
        this.productRepositoty = productRepositoty;
    }

    public Product saveProduct(Product product) {
        return productRepositoty.save(product);
    }

    @Override
    public List<Product> getAllproduct() {
        return productRepositoty.findAll();
    }
}
