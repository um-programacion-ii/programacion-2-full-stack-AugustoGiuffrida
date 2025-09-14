package com.hexagonal.hexagonal_basico.product.application.service;

import com.hexagonal.hexagonal_basico.product.domain.model.Product;
import com.hexagonal.hexagonal_basico.product.domain.ports.in.CreateProductUseCase;
import com.hexagonal.hexagonal_basico.product.domain.ports.in.GetAllProductsUseCase;
import com.hexagonal.hexagonal_basico.product.domain.ports.on.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements GetAllProductsUseCase, CreateProductUseCase {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
