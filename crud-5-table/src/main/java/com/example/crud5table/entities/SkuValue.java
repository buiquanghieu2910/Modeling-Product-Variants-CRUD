package com.example.crud5table.entities;

import com.example.crud5table.entities.embeddeds.SkuValueId;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * SkuValue.java
 */

@Entity(name = "SkuValue")
@Table(name = "sku_value")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class SkuValue {

    @EmbeddedId
    private SkuValueId skuValueId;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "value_id", referencedColumnName = "id", insertable = false, updatable = false),
            @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false),
            @JoinColumn(name = "option_id", referencedColumnName = "option_id", insertable = false, updatable = false)
    })
    @JsonProperty("value_id")
    private OptionValue optionValue;
}
