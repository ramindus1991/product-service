package com.rum.productservice.mapper;

import com.rum.productservice.dto.ProductRequestDTO;
import com.rum.productservice.dto.ProductResponseDTO;
import com.rum.productservice.mapper.base.BaseRequestResponseMapper;
import com.rum.productservice.model.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseRequestResponseMapper<ProductEntity, ProductRequestDTO, ProductResponseDTO> {

}
