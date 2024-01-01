package com.example.crud5table.repositories;

import com.example.crud5table.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * ProductRepository.java
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
