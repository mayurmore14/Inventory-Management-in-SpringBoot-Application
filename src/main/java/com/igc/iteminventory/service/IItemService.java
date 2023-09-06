package com.igc.iteminventory.service;

import com.igc.iteminventory.entity.ItemEntity;
import com.igc.iteminventory.model.ItemModel;

import java.util.List;
import java.util.Optional;

public interface IItemService {

    public ItemEntity addItem(ItemModel itemModel);

    public List<ItemEntity> getAllItems();

    public Optional<ItemEntity> getItemById(int id);

    public String deleteItemById(int id);

    public ItemEntity updateItemById(int id, ItemModel itemModel);
}
