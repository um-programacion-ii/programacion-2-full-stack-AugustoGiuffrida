package com.hexagonal.hexagonal_basico.product.domain.ports.on;

import com.hexagonal.hexagonal_basico.product.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Product save(Product product);
    Optional<Product> findById(long id);
    List<Product> findAll();
    Optional<Product> update(Long id, Product product);
    boolean deleteById(long id);

}
