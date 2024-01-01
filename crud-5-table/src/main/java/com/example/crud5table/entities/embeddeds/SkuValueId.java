package com.example.crud5table.entities.embeddeds;

import com.example.crud5table.entities.Option;
import com.example.crud5table.entities.Product;
import com.example.crud5table.entities.ProductSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * SkuValueId.java
 */

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkuValueId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;

    @ManyToOne
    @JoinColumn(name = "sku_id")
    @JsonProperty("product_sku")
    private ProductSku productSku;
}
