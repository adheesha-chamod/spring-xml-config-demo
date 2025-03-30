package org.adheesha;

public class Product {

    private String id;
    private String name;
    private double price;

//    Product() {
//        System.out.println("Product object is created! - Product()");
//    }

    public Product(String id, String name, double price) {
        System.out.println("Product object is created! - Product(id, name, price)");

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void buy() {
        System.out.println("Product is bought!");
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
