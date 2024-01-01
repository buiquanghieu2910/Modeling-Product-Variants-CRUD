package com.example.crud5table.services.impl;

import com.example.crud5table.repositories.SkuValueRepository;
import com.example.crud5table.services.SkuValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * SkuValueServiceImpl.java
 */

@Service
public class SkuValueServiceImpl implements SkuValueService {

    @Autowired
    private SkuValueRepository skuValueRepo;

    @Override
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.skuValueRepo.findAll());
    }
}
