package com.inventoryalerts.service;

import com.inventoryalerts.model.InventoryItem;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InventoryService {

    private Map<String, InventoryItem> inventory = new HashMap<>();

    public InventoryService() {
        inventory.put("item1", new InventoryItem("item1", 5));
        inventory.put("item2", new InventoryItem("item2", 15));
        inventory.put("item3", new InventoryItem("item3", 2));
    }

    public boolean isLowStock(String itemName) {
        InventoryItem item = inventory.get(itemName);
        if (item != null) {
            return item.getQuantity() < 10;
        }
        return false;
    }
}
