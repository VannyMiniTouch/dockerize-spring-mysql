package com.istad.dockerizespringbootmysql.product.dto;
import lombok.Data;
@Data
public class ProductResponseDTO {
    private Long id;
    private String name;
    private Double price;
    private String proCode;
    private String image;
    private boolean inStock;
}
