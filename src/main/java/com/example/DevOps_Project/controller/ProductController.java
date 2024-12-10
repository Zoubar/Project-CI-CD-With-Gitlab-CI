package com.example.DevOps_Project.controller;


import com.example.DevOps_Project.controller.util.ApiResponse;
import com.example.DevOps_Project.dao.ProductDao;
import com.example.DevOps_Project.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class ProductController {


        @Autowired
        ProductDao productDao;

        @GetMapping
        public List<Product> productList() {
                List<Product> products = productDao.findAll();
                return products;
        }

        @GetMapping(value = "/product/{id}")
        public Optional<Product> getAProduct(@PathVariable int id) {
                Optional<Product> product = productDao.findById(id);
                return product;
        }


        @PostMapping
        public ApiResponse<Product> createProduct(@RequestBody Product p) {
                return new ApiResponse<Product>(HttpStatus.OK.value(), "Product saved succefully", String.valueOf(productDao.save(p)));

        }

        @PutMapping("/{id}")
        public ApiResponse<Product> updateProduct(@PathVariable("id") Integer id, @RequestBody Product p) {
                Optional<Product> product = productDao.findById(id);

                if (product.isEmpty()) {
                        return new ApiResponse<>(
                                HttpStatus.NOT_FOUND.value(),
                                "Product with id " + id + " not found",
                                null
                        );
                }

                p.setId(id); // Ensure the product ID is set correctly
                Product updatedProduct = productDao.save(p); // Save the updated product

                return new ApiResponse<Product>(
                        HttpStatus.OK.value(),
                        "Product updated successfully",
                        String.valueOf(productDao.save(p)));
        }

        @DeleteMapping("/{id}")
        public ApiResponse<Void> deleteProduct(@PathVariable Integer id) {
                Optional<Product> product = productDao.findById(id);

                if (product.isEmpty()) {
                        return new ApiResponse<>(
                                HttpStatus.NOT_FOUND.value(),
                                "Product with id " + id + " not found",
                                null
                        );
                }

                productDao.deleteById(id);
                return new ApiResponse<>(
                        HttpStatus.OK.value(),
                        "Product deleted successfully",
                        null
                );
        }
};

