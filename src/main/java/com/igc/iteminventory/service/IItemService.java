package com.igc.iteminventory.service;

import com.igc.iteminventory.entity.ItemEntity;

import java.util.ArrayList;

public interface IItemService {

    public ItemEntity addItem(ItemEntity itemEntity);

    public ItemEntity getItem();

    public ArrayList<ItemEntity> getAllItems();
}
