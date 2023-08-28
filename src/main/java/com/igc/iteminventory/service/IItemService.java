package com.igc.iteminventory.service;

import com.igc.iteminventory.entity.ItemEntity;

import java.util.ArrayList;
import java.util.List;

public interface IItemService {

    public ItemEntity addItem(ItemEntity itemEntity);

    public List<ItemEntity> getAllItems();

    public ItemEntity getItemById(int id);

    public String deleteItemById(int id);

    public ItemEntity updateItemById(int id, ItemEntity item);
}
