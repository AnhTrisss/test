package com.jewelry_store.jewelry_store.dto;

import com.jewelry_store.jewelry_store.entity.Staff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AreaDTO {

    private String areaId;
    private String areaName;
    private Staff staff;
}
