package com.pranav.backend_sst.Controllers;

import com.pranav.backend_sst.Models.Product;
import com.pranav.backend_sst.Services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService ProductService;
    ProductController(ProductService productService) {
        this.ProductService = productService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return ProductService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return ProductService.getAllProducts();
    }
}
