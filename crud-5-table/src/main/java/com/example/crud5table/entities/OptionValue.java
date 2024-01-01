package com.example.crud5table.entities;

import com.example.crud5table.entities.embeddeds.OptionValueId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * OptionValue.java
 */

@Entity(name = "OptionValue")
@Table(name = "option_values")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class OptionValue {

    @EmbeddedId
    private OptionValueId optionValueId;

    @Column(name = "name", nullable = false, length = 255)
    private String name;
}
