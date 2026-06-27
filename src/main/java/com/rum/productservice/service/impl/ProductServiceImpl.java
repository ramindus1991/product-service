package com.rum.productservice.service.impl;

import com.rum.productservice.dto.ProductRequestDTO;
import com.rum.productservice.dto.ProductResponseDTO;
import com.rum.productservice.mapper.ProductMapper;
import com.rum.productservice.model.ProductEntity;
import com.rum.productservice.repository.ProductRepository;
import com.rum.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private ProductMapper productMapper;
    private ProductRepository productRepository;

    public void createProduct(ProductRequestDTO productRequest){
        ProductEntity product = productMapper.mapToEntity(productRequest);
        productRepository.save(product);
        log.info("Product {} is saved", product.getName());
    }

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        return productMapper.mapToResponse(productRepository.findAll());
    }
}
