package com.example.crud5table.repositories;

import com.example.crud5table.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * OptionRepository.java
 */

@Repository
public interface OptionRepository extends JpaRepository<Option, String> {
}
