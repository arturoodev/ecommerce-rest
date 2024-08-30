package org.arturocode.ecommercerest.request;

import lombok.Data;
import org.arturocode.ecommercerest.model.Category;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
