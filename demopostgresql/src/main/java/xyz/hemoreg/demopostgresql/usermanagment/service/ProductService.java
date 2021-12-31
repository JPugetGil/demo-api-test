package xyz.hemoreg.demopostgresql.usermanagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.hemoreg.demopostgresql.usermanagment.dto.ProductDTO;
import xyz.hemoreg.demopostgresql.usermanagment.model.Product;
import xyz.hemoreg.demopostgresql.usermanagment.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public List<ProductDTO> getProducts() {
        return productRepository
                .findAll()
                .stream()
                .map(Product::toProductDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO getProductById(Integer id) {
        return productRepository
                .getById(id)
                .toProductDTO();
    }
}
