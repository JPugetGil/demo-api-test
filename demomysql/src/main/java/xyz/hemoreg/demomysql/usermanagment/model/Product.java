package xyz.hemoreg.demomysql.usermanagment.model;

import lombok.Getter;
import lombok.Setter;
import xyz.hemoreg.demomysql.usermanagment.dto.ProductDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private double price;

    public ProductDTO toProductDTO() {
        return new ProductDTO(id, name, price);
    }
}
