package xyz.hemoreg.datagenerator.dto;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "(" + id + ",'" + name + "'," + price + ",'" + model + "')";
    }
}
