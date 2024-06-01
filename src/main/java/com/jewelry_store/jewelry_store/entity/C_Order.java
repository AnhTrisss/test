package com.jewelry_store.jewelry_store.entity;

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
@Table(name = "c_Order")
public class C_Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_ID")
    private int order_Id;

    @Column(name = "Area_Name")
    private String areaName;

    @ManyToMany(mappedBy = "Staff_Order")
    Set<Staff> Staff_O;

    

    @ManyToMany
    @JoinTable(
        name = "Order_Product", 
        joinColumns = @JoinColumn(name = "Order_ID"), 
        inverseJoinColumns = @JoinColumn(name = "Product_ID"))
    Set<C_Order> Order_Product;
}
