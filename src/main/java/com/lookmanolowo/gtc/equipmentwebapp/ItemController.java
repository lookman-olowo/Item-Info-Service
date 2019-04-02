package com.lookmanolowo.gtc.equipmentwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController{
    private ItemServices itemServices;

    @Autowired
    public ItemController(ItemServices itemServices){
        super();
        this.itemServices = itemServices;
    }

    @GetMapping
    public String getAllItems(Model model){
        model.addAttribute("items", this.itemServices.getAllItems());
        return "items";
    }
}
