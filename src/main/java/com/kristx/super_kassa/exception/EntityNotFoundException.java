package com.kristx.super_kassa.exception;

public class EntityNotFoundException extends RuntimeException{

        public EntityNotFoundException() {
            super("Example not found");
        }
}
