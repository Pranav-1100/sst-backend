package com.pranav.backend_sst.Services;

import com.pranav.backend_sst.Models.Product;
import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();
}