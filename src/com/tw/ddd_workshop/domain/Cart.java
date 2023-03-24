package com.tw.ddd_workshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items;

    public Cart(List<Item> items) {
        this.items = items;
    }

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }

    public void remove(String itemName)
    {
        items.removeIf(item -> item.getProduct().getName().equals(itemName));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
