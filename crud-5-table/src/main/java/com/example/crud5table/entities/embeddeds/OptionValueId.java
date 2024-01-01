package com.example.crud5table.entities.embeddeds;

import com.example.crud5table.entities.Option;
import com.example.crud5table.entities.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author BUI_QUANG_HIEU
 * 12/30/2023
 * OptionValueId.java
 */

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OptionValueId implements Serializable {

    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false, length = 50)
    private String id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        OptionValueId that = (OptionValueId) o;
        return id.equals(that.id) && product.equals(that.product) && option.equals(that.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, option);
    }
}
