package com.istad.dockerizespringbootmysql.product.controller;

import com.istad.dockerizespringbootmysql.product.dto.ProductRequestDTO;
import com.istad.dockerizespringbootmysql.product.dto.ProductResponseDTO;
import com.istad.dockerizespringbootmysql.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/ping")
    public String pingTest(){
        return "Service is running...";
    }

    @PostMapping("/create")
    public ProductRequestDTO createProduct(@RequestBody ProductRequestDTO productRequestDTO){
        return productService.createProduct(productRequestDTO);
    }

    @GetMapping("/list")
    public List<ProductResponseDTO> listUser(){
        return productService.listProduct();
    }

}
