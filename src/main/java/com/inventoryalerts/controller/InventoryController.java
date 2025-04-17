package com.inventoryalerts.controller;

import com.inventoryalerts.model.InventoryItem;
import com.inventoryalerts.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/check-stock")
    public String checkStock(@RequestParam String itemName) {
        boolean isLowStock = inventoryService.isLowStock(itemName);
        if (isLowStock) {
            return "Alert: " + itemName + " is low on stock!";
        }
        return itemName + " has sufficient stock.";
    }
}
