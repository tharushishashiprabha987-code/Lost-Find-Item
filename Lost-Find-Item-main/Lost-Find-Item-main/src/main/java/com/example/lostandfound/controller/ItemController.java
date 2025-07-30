package com.example.lostandfound.controller;

import com.example.lostandfound.model.Item;
import com.example.lostandfound.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepo;

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemRepo.save(item);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return itemRepo.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item newItem) {
        Item item = itemRepo.findById(id).orElse(null);
        if (item != null) {
            item.setName(newItem.getName());
            item.setDescription(newItem.getDescription());
            item.setStatus(newItem.getStatus());
            return itemRepo.save(item);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable Long id) {
        itemRepo.deleteById(id);
        return "Item deleted";
    }
}

