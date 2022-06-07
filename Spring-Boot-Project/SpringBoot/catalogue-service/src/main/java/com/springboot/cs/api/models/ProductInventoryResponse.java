package com.springboot.cs.api.models;

import lombok.Data;

@Data
public class ProductInventoryResponse {
    private String productCode;
    private Integer availableQuantity = 0;
}
