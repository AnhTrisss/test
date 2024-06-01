package com.jewelry_store.jewelry_store.dto;

import java.util.Set;

import com.jewelry_store.jewelry_store.entity.C_Order;
import com.jewelry_store.jewelry_store.entity.Staff;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class C_OrderDTO {

    private String orderId;
    private String areaName;
    Set<Staff> Staff_O;
    Set<C_Order> Order_Product;
}
