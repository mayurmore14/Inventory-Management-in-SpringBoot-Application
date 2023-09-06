package com.igc.iteminventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int quantity;
    private int price;
    private String status;


    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }

    public int getquantity() {
        return quantity;
    }
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }
    public void setprice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }
}
