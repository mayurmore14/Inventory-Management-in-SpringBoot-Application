package com.igc.iteminventory.controller;

import com.igc.iteminventory.entity.ItemEntity;
import com.igc.iteminventory.service.IItemService;
import com.igc.iteminventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/invapi")
public class ItemController {

    @Autowired
    IItemService itemService;

    @GetMapping("/home")
    public String homePage() {
        return "Welcome to Item Api";
    }

    @PostMapping("/additem")
    public ItemEntity addItem(@RequestBody ItemEntity itemEntity) {
        return itemService.addItem(itemEntity);
    }

    @GetMapping("/getitem")
    public ItemEntity getItem() {
        return itemService.getItem();

    }
        @GetMapping("/getallitems")
        public ArrayList<ItemEntity> getAllItems() {
            return itemService.getAllItems();
    }
}
