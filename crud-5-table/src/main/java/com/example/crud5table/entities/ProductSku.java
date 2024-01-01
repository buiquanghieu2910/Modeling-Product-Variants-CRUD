package com.example.crud5table.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * ProductSku.java
 */

@Entity(name = "ProductSku")
@Table(name = "product_skus")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class ProductSku {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false, length = 50)
    private String id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private BigDecimal price;
}
