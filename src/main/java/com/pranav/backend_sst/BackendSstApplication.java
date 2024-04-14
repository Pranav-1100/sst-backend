package com.pranav.backend_sst;

import com.pranav.backend_sst.Models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendSstApplication {

    public static void main(String[] args) {

        SpringApplication.run(BackendSstApplication.class, args);

        Product product = new Product();
    }

}
