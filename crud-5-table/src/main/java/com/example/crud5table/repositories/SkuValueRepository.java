package com.example.crud5table.repositories;

import com.example.crud5table.entities.SkuValue;
import com.example.crud5table.entities.embeddeds.SkuValueId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * SkuValueRepository.java
 */

@Repository
public interface SkuValueRepository extends JpaRepository<SkuValue, SkuValueId> {
}
