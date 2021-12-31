package xyz.hemoreg.demopostgresql.usermanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.hemoreg.demopostgresql.usermanagment.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> { }
