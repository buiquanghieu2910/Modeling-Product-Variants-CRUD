package com.example.crud5table.controllers;

import com.example.crud5table.services.SkuValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * SkuValueController.java
 */

@RestController
@RequestMapping("/api/sku-value")
public class SkuValueController {

    @Autowired
    private SkuValueService skuValueService;

    @GetMapping
    public ResponseEntity<?> getAllData(){
        return this.skuValueService.getAll();
    }
}
