package com.hexagonal.hexagonal_basico.product.domain.ports.in;

import com.hexagonal.hexagonal_basico.product.domain.model.Product;

public interface CreateProductUseCase {
    Product createProduct(Product product);
}
