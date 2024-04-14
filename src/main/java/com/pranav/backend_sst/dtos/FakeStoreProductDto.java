package com.pranav.backend_sst.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreProductDto {
    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
