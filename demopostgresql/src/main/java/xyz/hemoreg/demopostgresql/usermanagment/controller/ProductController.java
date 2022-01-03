package xyz.hemoreg.demopostgresql.clientmanagment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hemoreg.demopostgresql.usermanagment.dto.ProductDTO;
import xyz.hemoreg.demopostgresql.usermanagment.service.ProductService;

import java.util.List;

@RestController()
@RequestMapping(path = "/products")
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> getProducts() {
        return productService.getProducts();
    }

    @GetMapping(path= "/{id}")
    public ProductDTO getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
