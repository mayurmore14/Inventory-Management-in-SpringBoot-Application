package com.igc.iteminventory.service;

import com.igc.iteminventory.entity.ItemEntity;
import com.igc.iteminventory.repo.IItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

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
    public ItemEntity getItemById(int id) {
        return itemRepo.findById(id).get();
    }

    @Override
    public String deleteItemById(int id) {
        ItemEntity item = getItemById(id);
        itemRepo.delete(item);
        return "Item Deleted Successfully";
    }

    @Override
    public ItemEntity updateItemById(int id, ItemEntity item) {
        ItemEntity oldItem = getItemById(id);

        oldItem.setname(item.getname());
        oldItem.setdescription(item.getdescription());
        oldItem.setquantity(item.getquantity());
        oldItem.setprice(item.getPrice());
        oldItem.setstatus(item.getStatus());

        return itemRepo.save(oldItem);

    }
}
