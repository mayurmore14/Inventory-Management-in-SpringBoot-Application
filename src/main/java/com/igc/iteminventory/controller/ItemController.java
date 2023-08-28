package com.igc.iteminventory.controller;

import com.igc.iteminventory.entity.ItemEntity;
import com.igc.iteminventory.service.IItemService;
import com.igc.iteminventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public ResponseEntity<?> addItem(@RequestBody ItemEntity itemEntity) {
        return new ResponseEntity<>(itemService.addItem(itemEntity), HttpStatus.CREATED);
    }

    @GetMapping("/getallitems")
    public ResponseEntity<List<ItemEntity>> getAllItems() {
        return new ResponseEntity<>(itemService.getAllItems(), HttpStatus.FOUND);
    }

    @GetMapping("/getitembyid/{id}")
    public ResponseEntity<?> getItemById(@PathVariable("id") int id) {
        return new ResponseEntity<>(itemService.getItemById(id),HttpStatus.FOUND);
    }

    @GetMapping("/deleteitembyid/{id}")
    public ResponseEntity<?> deleteItemById(@PathVariable("id") int id) {
       return new ResponseEntity<>(itemService.deleteItemById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateitembyid/{id}")
    public ResponseEntity<?> updateItemById(@PathVariable("id") int id, @RequestBody ItemEntity item) {
        return new ResponseEntity<>(itemService.updateItemById(id,item),HttpStatus.PROCESSING);
    }
}
