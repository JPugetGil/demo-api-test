package xyz.hemoreg.demomysql.usermanagment.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private long id;
    private String name;
    private double price;
    private String model;

    public ProductDTO(long id, String name, double price, String model) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.model = model;
    }
}
