package com.example.nutrishell;

public class RecyclerData {

    private String itemName;
    private Integer itemImage;
    private String itemId;

    public RecyclerData(String itemName, Integer itemImage, String itemId) {
        this.itemName = itemName;

        this.itemImage = itemImage;
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemImage() {
        return itemImage;
    }

    public void setItemImage(Integer itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

}

