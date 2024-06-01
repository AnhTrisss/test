package com.jewelry_store.jewelry_store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "staffDetail")
public class StaffDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StaffDetail_ID")
    private int staffDetail_ID;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Age")
    private int age;

    @Column(name = "Address")
    private String address;

    @Column(name = "Email")
    private String email;

    @OneToOne(mappedBy = "Staff_ID")
    @JsonIgnore
    private Staff staff;

}
