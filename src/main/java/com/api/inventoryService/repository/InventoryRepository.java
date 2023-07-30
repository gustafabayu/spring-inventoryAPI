package com.api.inventoryService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.inventoryService.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
