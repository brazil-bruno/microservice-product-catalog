package com.bruno.microservices.product.service;

import com.bruno.microservices.product.dto.ProductRequest;
import com.bruno.microservices.product.model.Product;
import com.bruno.microservices.product.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
    }
}
