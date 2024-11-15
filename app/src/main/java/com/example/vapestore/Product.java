package com.example.vapestore;

public class Product {
    private int imageResId;
    private String name;

    public Product(int imageResId, String name) {
        this.imageResId = imageResId;
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }
}
