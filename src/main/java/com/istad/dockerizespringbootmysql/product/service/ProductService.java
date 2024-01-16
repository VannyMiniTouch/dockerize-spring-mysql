package com.istad.dockerizespringbootmysql.product.service;

import com.istad.dockerizespringbootmysql.product.dto.ProductRequestDTO;
import com.istad.dockerizespringbootmysql.product.dto.ProductResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ProductRequestDTO createProduct(ProductRequestDTO productRequestDTO);
    List<ProductResponseDTO> listProduct();
}
