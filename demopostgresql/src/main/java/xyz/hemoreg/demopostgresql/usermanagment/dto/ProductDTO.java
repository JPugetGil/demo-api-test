package xyz.hemoreg.demopostgresql.usermanagment.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private long id;
    private String name;
    private double price;

    public ProductDTO(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
