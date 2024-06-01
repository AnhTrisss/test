package com.jewelry_store.jewelry_store.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
@Table( name = "staff")
public class Staff {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Staff_ID")
    private int staffId;

    @OneToOne
    @JoinColumn(name = "Account_ID")
    @JsonIgnore
    private User accountID;

    @OneToOne
    @JoinColumn(name = "Area_ID")
    @JsonIgnore
    private Area areaID;

    @OneToOne
    @JoinColumn(name = "StaffDetail_ID")
    @JsonIgnore
    private StaffDetail staffDetailID;

    @ManyToMany
    @JoinTable(
        name = "Staff_Order", 
        joinColumns = @JoinColumn(name = "Staff_ID"), 
        inverseJoinColumns = @JoinColumn(name = "Order_ID"))
    Set<C_Order> Staff_Order;
}
