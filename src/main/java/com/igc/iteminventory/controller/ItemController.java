package com.igc.iteminventory.controller;

import com.igc.iteminventory.entity.ItemEntity;
import com.igc.iteminventory.model.ItemModel;
import com.igc.iteminventory.responses.Responses;
import com.igc.iteminventory.service.IItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    public ResponseEntity<?> addItem(@RequestBody @Valid ItemModel itemModel) {
         return new ResponseEntity<>(new Responses("Item Added Sucsessfuly", HttpStatus.CREATED,itemService.addItem(itemModel)),HttpStatus.CREATED);
    }

    @GetMapping("/getallitems")
    public ResponseEntity<?> getAllItems() {
        return new ResponseEntity<>(new Responses("Item Found",HttpStatus.FOUND,itemService.getAllItems()),HttpStatus.FOUND);
    }

    @GetMapping("/getitembyid/{id}")
    public ResponseEntity<?> getItemById(@PathVariable("id") int id) {
        Responses responses = new Responses("Item Found",HttpStatus.FOUND,itemService.getItemById(id));
        return new ResponseEntity<>(responses,HttpStatus.FOUND);
    }

    @GetMapping("/deleteitembyid/{id}")
    public ResponseEntity<?> deleteItemById(@PathVariable("id") int id) {
       return new ResponseEntity<>(new Responses("Item Deleted Successfully",null,itemService.deleteItemById(id)),HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateitembyid/{id}")
    public ResponseEntity<?> updateItemById(@PathVariable("id") int id, @RequestBody ItemModel itemModel) {
        return new ResponseEntity<>(new Responses("Item Updated Successfully",HttpStatus.PROCESSING,itemService.updateItemById(id,itemModel)),HttpStatus.PROCESSING);
    }
}
