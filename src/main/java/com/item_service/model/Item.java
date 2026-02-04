package com.item_service.model;

public class Item {
    private Long id;
    private String name;
    private String description;
    private String expiry;

    public Item(String expiry, String description, String name, Long id) {
        this.expiry = expiry;
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
