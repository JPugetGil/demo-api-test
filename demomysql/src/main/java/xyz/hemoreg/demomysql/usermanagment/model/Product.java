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
    private long id;
    private String name;
    private double price;
    private String model;

    public ProductDTO toProductDTO() {
        return new ProductDTO(id, name, price, model);
    }
}
