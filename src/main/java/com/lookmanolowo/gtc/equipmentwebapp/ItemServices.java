package com.lookmanolowo.gtc.equipmentwebapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServices {
    private static List<Item> items = new ArrayList<>();

    static{
        for(int i=0; i<10; i++){
            items.add(new Item(i, "Item" + i, "I"+i, "$$"));
        }
    }

    public List<Item> getAllItems(){
        return items;
    }
}
