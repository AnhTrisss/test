package com.jewelry_store.jewelry_store.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_ID")
    private int productId;

    @Column(name = "P_name")
    private String pName;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "GoldWeight")
    private String goldWeight;

    @Column(name = "DiamondWeight")
    private String diamondWeight;

    @Column(name = "size")
    private int size;

    @Column(name = "Type")
    private String type;

    @Column(name = "stockQuanity")
    private int stockQuanity;

    @Column(name = "Image_ID")
    private int imageId;

    @Column(name = "barcode", unique = true)
    private String barcode;

    @Column(name = "isActive")
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "GoldType_ID")
    private GoldType goldType;

    @ManyToOne
    @JoinColumn(name = "DiamondType_ID")
    private DiamondType diamondType;

    @ManyToMany(mappedBy = "Order_Product")
    Set<Staff> ProductList;
}
