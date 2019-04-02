package com.lookmanolowo.gtc.equipmentwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private ItemServices itemServices;

    @Autowired
    public ApiController(ItemServices itemServices){
        super();
        this.itemServices = itemServices;
    }

    @GetMapping("/items")
    public List<Item> getAllItems(){
    return this.itemServices.getAllItems();
    }
}
