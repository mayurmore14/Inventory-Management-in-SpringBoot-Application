package com.igc.iteminventory.repo;

import com.igc.iteminventory.entity.ItemEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepo extends JpaRepository<ItemEntity, Integer> {
}
