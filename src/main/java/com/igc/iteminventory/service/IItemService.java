package com.igc.iteminventory.service;

import com.igc.iteminventory.entity.ItemEntity;

import java.util.List;
import java.util.Optional;

public interface IItemService {

    public ItemEntity addItem(ItemEntity itemEntity);

    public List<ItemEntity> getAllItems();

    public Optional<ItemEntity> getItemById(int id);

    public String deleteItemById(int id);

    public ItemEntity updateItemById(int id, ItemEntity item);
}
