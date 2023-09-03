package com.igc.iteminventory.exception;

public class ItemNotFoundException extends  RuntimeException{
    public ItemNotFoundException(String message) {
        super(message);
    }
}
