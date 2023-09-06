package com.igc.iteminventory.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemModel {

    @NotBlank(message = "Please Enter Item Name")
    private String name;
    @NotBlank(message = "Please Enter the Description")
    private String description;
    private int quantity;
    private int price;
    private String status;
}
