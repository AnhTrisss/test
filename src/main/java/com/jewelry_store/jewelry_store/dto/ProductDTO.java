package com.jewelry_store.jewelry_store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    
    private int productId;
    private String pName;
    private String gender;
    private String goldWeight;
    private String diamondWeight;
    private int size;
    private String type;
    private int stockQuanity;
    private int imageId;
    private String barcode;
    private Boolean isActive;
    private int goldTypeId;
    private int diamondTypeId;
}
