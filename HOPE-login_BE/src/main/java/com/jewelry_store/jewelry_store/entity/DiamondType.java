package com.jewelry_store.jewelry_store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "diamondType")

public class DiamondType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DiamondType_ID")
    private int diamondTypeId;

    @Column(name = "Type")
    private String type;

    @Column(name = "Price")
    private int price;

    @Column(name = "edge_code", unique = true)
    private String edgeCode;
}
