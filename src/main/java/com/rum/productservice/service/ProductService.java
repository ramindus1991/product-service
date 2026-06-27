package com.rum.productservice.service;

import com.rum.productservice.dto.ProductRequestDTO;
import com.rum.productservice.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequestDTO productRequest);

    List<ProductResponseDTO> getAllProducts();

}
