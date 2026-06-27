package com.rum.productservice.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ProductResponseDTO(String id, String name, String description, BigDecimal price) {
}
