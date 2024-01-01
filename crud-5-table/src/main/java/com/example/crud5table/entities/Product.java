package com.example.crud5table.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * Product.java
 */

@Entity(name = "Product")
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Product {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false, length = 50)
    private String id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;
}
