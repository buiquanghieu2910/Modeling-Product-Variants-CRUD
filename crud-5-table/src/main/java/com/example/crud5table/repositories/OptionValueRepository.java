package com.example.crud5table.repositories;

import com.example.crud5table.entities.OptionValue;
import com.example.crud5table.entities.embeddeds.OptionValueId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * OptionValueRepository.java
 */

@Repository
public interface OptionValueRepository extends JpaRepository<OptionValue, OptionValueId> {
}
