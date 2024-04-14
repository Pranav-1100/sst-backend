package com.pranav.backend_sst.Controllers;

import com.pranav.backend_sst.Models.Product;
import com.pranav.backend_sst.Services.ProductService;
import com.pranav.backend_sst.Dtos.Exception_Dto;
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
        //throw new RuntimeException("Something went wrong");
//        ResponseEntity<Product> responseEntity = null;
//        Product product = null;
//        try {
//            product = ProductService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            System.out.println("Hello");
//            return responseEntity;
//        } catch (RuntimeException exception) {
//            Exception_Dto dto = new Exception_Dto();
//            dto.setMessage("Some Error is coming up! Bye Bye");
//            ResponseEntity<Exception_Dto> response =
//                    new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
//            return response;
//        }
        return ProductService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return ProductService.getAllProducts();
    }
}
