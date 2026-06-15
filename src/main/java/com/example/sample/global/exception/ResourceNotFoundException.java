// src/main/java/com/example/sample/global/exception/ResourceNotFoundException.java
package com.example.sample.global.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resource, Long id) {
        super(resource + " not found with id: " + id);
    }
}
