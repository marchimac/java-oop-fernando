package com.example;

public class Product {

    // atributos
    private String description;
    private String model;
    private String manufacturer;
    private Integer reference;
    private Integer quantity;
    private Double unitCost;


    // constructores

    public Product() {
    }

    public Product(String description, String model, String manufacturer, Integer reference, Integer quantity, Double unitCost) {
        this.description = description;
        this.model = model;
        this.manufacturer = manufacturer;
        this.reference = reference;
        this.quantity = quantity;
        this.unitCost = unitCost;
    }

    // métodos getter y setter

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getReference() {
        return reference;
    }

    public void setReference(Integer reference) {
        this.reference = reference;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }


    // toString
    @Override
    public String toString() {
        return "Producto: " +
                " Description => '" + description + '\'' +
                ", Model => '" + model + '\'' +
                ", Manufacturer => '" + manufacturer + '\'' +
                ", Reference => " + reference +
                ", Quantity => " + quantity +
                ", Unit cost => " + unitCost +
                '}';
    }
}
