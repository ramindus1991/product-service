package com.rum.productservice.repository;

import com.rum.productservice.model.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {


}
