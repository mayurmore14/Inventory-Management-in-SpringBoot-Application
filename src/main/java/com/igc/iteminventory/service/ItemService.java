package com.igc.iteminventory.service;

import com.igc.iteminventory.entity.ItemEntity;
import com.igc.iteminventory.exception.ItemNotFoundException;
import com.igc.iteminventory.repo.IItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ItemService implements IItemService {

    @Autowired
    IItemRepo itemRepo;
    @Override
    public ItemEntity addItem(ItemEntity itemEntity) {
        itemRepo.save(itemEntity);
        return itemEntity;
    }

    @Override
    public List<ItemEntity> getAllItems() {
        return itemRepo.findAll();
    }

    @Override
    public Optional<ItemEntity> getItemById(int id) {
        Optional<ItemEntity> itemEntity = itemRepo.findById(id);
        if(itemEntity.isPresent()) {
            return itemEntity;
        } else {
            throw new ItemNotFoundException("Item With Given Id Not Found in Database ");
        }

    }

    @Override
    public String deleteItemById(int id) {
        ItemEntity item = itemRepo.findById(id).get();
        itemRepo.delete(item);
        return "Item Deleted Successfully";
    }

    @Override
    public ItemEntity updateItemById(int id, ItemEntity item) {
        ItemEntity oldItem = itemRepo.findById(id).get();

        oldItem.setname(item.getname());
        oldItem.setdescription(item.getdescription());
        oldItem.setquantity(item.getquantity());
        oldItem.setprice(item.getPrice());
        oldItem.setstatus(item.getStatus());

        return itemRepo.save(oldItem);

    }
}
