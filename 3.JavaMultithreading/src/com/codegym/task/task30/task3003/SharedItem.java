package com.codegym.task.task30.task3003;

// This class shows how to call other constructors using 'this'
public class SharedItem {
    public String description;
    public int itemId;

    public SharedItem() {
        this("Test Item", 0);
    }

    public SharedItem(String description) {
        this(description, 0);
    }

    public SharedItem(int itemId) {
        this("Test Item", itemId);
    }

    public SharedItem(String description, int itemId) {
        this.description = description;
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public int getItemId() {
        return itemId;
    }
}
