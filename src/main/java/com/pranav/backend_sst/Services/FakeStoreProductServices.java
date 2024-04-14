package com.pranav.backend_sst.Services;

import com.pranav.backend_sst.Models.Product;
import com.pranav.backend_sst.dtos.FakeStoreProductDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductServices implements ProductService {
    @Override
    public Product getProductById(Long id) {
            RestTemplate restTemplate = new RestTemplate();
            FakeStoreProductDto fakeStoreProductDto =
                    restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
                            FakeStoreProductDto.class);


            Product product = new Product();
            product.setId(fakeStoreProductDto.getId());
            product.setTitle(fakeStoreProductDto.getTitle());
            product.setDescription(fakeStoreProductDto.getDescription());
            product.setImage(fakeStoreProductDto.getImage());

            return product;
    }

}
