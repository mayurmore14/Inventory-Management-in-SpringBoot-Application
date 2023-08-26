package com.igc.iteminventory.entity;

public class ItemEntity {
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

    public String getStatus(String status) {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }
}
