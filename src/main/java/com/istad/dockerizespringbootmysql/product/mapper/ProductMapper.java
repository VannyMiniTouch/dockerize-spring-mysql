package com.istad.dockerizespringbootmysql.product.mapper;

import com.istad.dockerizespringbootmysql.product.dto.ProductRequestDTO;
import com.istad.dockerizespringbootmysql.product.dto.ProductResponseDTO;
import com.istad.dockerizespringbootmysql.product.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product fromDtoToEntity(ProductRequestDTO productRequestDTO);
    List<ProductResponseDTO> fromListEntity(List<Product> products);

}
