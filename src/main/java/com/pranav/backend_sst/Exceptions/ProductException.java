package com.pranav.backend_sst.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductException extends RuntimeException{
    private Long id;
    public ProductException(Long id, String message) {
        super(message);
        this.id = id;
    }
}
