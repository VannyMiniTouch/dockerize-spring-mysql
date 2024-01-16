package com.istad.dockerizespringbootmysql.product.repo;

import com.istad.dockerizespringbootmysql.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
