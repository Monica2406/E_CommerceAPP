package com.ecommerce.service;

import com.ecommerce.dto.ProductDto;
import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();
    ProductDto getProductById(Long id);
    ProductDto addProduct(ProductDto productDto);
    void deleteProduct(Long id);
    
 
    ProductDto updateProduct(Long id, ProductDto productDto);
}
