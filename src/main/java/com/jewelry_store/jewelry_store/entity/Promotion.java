package com.jewelry_store.jewelry_store.entity;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Promotion_ID")
    private int promotionId;

    @Column(name = "P_name")
    private String pName;

    @Column(name = "desprection")
    private String description;

    @Column(name = "starDate")
    private Date starDate;

    @Column(name = "endDate")
    private Date endDate;

    @ManyToMany
    @JoinTable(
        name = "Promotion_Detail", 
        joinColumns = @JoinColumn(name = "Promotion_ID"), 
        inverseJoinColumns = @JoinColumn(name = "Order_ID"))
    Set<C_Order> Promotion_Order;
}