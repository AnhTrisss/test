package com.jewelry_store.jewelry_store.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Warranty")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Warranty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Warranty_ID")
    private int warrantyId;

    @Column(name = "W_date", nullable = false)
    private Date wDate;

    @Column(name = "Deescription")
    private String description;

    @ManyToOne
    @JoinColumn(name = "Product_ID")
    private Product product;
}
