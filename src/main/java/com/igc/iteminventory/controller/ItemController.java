package com.igc.iteminventory.controller;

import com.igc.iteminventory.entity.ItemEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/invapi")
public class ItemController {

    ArrayList<ItemEntity> itemEntityList = new ArrayList<>();

    @GetMapping("/home")
    public String homePage() {
        return "Welcome to Item Api";
    }

    @PostMapping("/additem")
    public ItemEntity addItem(@RequestBody ItemEntity itemEntity) {
        itemEntityList.add(itemEntity);
        return itemEntity;
    }

    @GetMapping("/getitem")
    public ItemEntity getItem() {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setid(1);
        itemEntity.setname("Pen");
        itemEntity.setdescription("Ball Pen");
        itemEntity.setprice(30);
        itemEntity.setquantity(50);
        itemEntity.setstatus("Available");
        return itemEntity;

    }
        @GetMapping("/getallitems")
        public ArrayList<ItemEntity> getAllItems() {
        
            return itemEntityList;
    }
}
