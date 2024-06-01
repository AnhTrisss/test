package com.jewelry_store.jewelry_store.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
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
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bill_ID")
    private int billId;

    @Column(name = "Bill_Date")
    private Date billDate;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "FinalPrice")
    private int finalPrice;

    @ManyToOne
    @JoinColumn(name = "Order_ID")
    private C_Order order;

    @ManyToOne
    @JoinColumn(name = "Staff_ID")
    private Staff staff;
}
