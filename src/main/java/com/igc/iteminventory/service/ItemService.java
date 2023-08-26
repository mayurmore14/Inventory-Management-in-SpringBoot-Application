package com.igc.iteminventory.service;

import com.igc.iteminventory.entity.ItemEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemService implements IItemService {

    ArrayList<ItemEntity> itemEntityList = new ArrayList<>();

    @Override
    public ItemEntity addItem(ItemEntity itemEntity) {
        itemEntityList.add(itemEntity);
        return itemEntity;
    }

    @Override
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

    @Override
    public ArrayList<ItemEntity> getAllItems() {
        return itemEntityList;
    }
}
