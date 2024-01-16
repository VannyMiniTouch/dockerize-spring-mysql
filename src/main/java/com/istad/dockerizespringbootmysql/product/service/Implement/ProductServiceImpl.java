package com.istad.dockerizespringbootmysql.product.service.Implement;

import com.istad.dockerizespringbootmysql.product.dto.ProductRequestDTO;
import com.istad.dockerizespringbootmysql.product.dto.ProductResponseDTO;
import com.istad.dockerizespringbootmysql.product.mapper.ProductMapper;
import com.istad.dockerizespringbootmysql.product.repo.ProductRepo;
import com.istad.dockerizespringbootmysql.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ProductMapper productMapper;
    @Override
    public ProductRequestDTO createProduct(ProductRequestDTO productRequestDTO) {
        productRepo.save(productMapper.fromDtoToEntity(productRequestDTO));
        return productRequestDTO;

    }

    @Override
    public List<ProductResponseDTO> listProduct() {
       return productMapper.fromListEntity(productRepo.findAll());
    }
}
