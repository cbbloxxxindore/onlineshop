package com.vanguard.onlineshop.resource;

import com.vanguard.onlineshop.models.Product;
import com.vanguard.onlineshop.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductResource {
    ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product)
    {

        return ResponseEntity.ok(productService.saveProduct(product));
    }
@GetMapping("/products")
    public ResponseEntity<List<Product> >getAllproduct()
    {

        return ResponseEntity.ok(productService.getAllproduct());
    }
}
