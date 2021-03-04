package model;

import model.enums.Manufacturer;
import model.enums.ShelfLife;

public class Product {
    private int id;
    private String name;
    private int upc;
    private Manufacturer manufacturer;
    private double price;
    private ShelfLife shelfLife;
    private int count;

    public Product(int id, String name, int upc, Manufacturer manufacturer, double price, ShelfLife shelfLife, int count) {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.count = count;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUpc() {
        return upc;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public ShelfLife getShelfLife() {
        return shelfLife;
    }

    public int getCount() {
        return count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

