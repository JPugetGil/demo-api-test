package xyz.hemoreg.demomysql.usermanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.hemoreg.demomysql.usermanagment.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { }
