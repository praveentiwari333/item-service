package com.item_service.controller;

import com.item_service.model.Item;
import com.item_service.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> addItem(@RequestBody Item item) {

        // simple validation
        if (item.getName() == null || item.getName().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        Item savedItem = itemService.addItem(item);
        return ResponseEntity.ok(savedItem);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {

        Item item = itemService.getItemById(id);

        if (item == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(item);
    }

}
