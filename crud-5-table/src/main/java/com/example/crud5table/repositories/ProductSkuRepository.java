package com.example.crud5table.repositories;

import com.example.crud5table.entities.ProductSku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * ProductSkuRepository.java
 */

@Repository
public interface ProductSkuRepository extends JpaRepository<ProductSku, String> {
}
