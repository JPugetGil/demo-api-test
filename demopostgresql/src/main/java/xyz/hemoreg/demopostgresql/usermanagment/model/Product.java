package xyz.hemoreg.demopostgresql.usermanagment.model;

import lombok.Getter;
import lombok.Setter;
import xyz.hemoreg.demopostgresql.usermanagment.dto.ProductDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @Column(nullable = false)
    private long id;
    private String name;
    private double price;

    public ProductDTO toProductDTO() {
        return new ProductDTO(id, name, price);
    }
}
