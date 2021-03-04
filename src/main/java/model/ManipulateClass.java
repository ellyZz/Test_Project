package model;

import static model.enums.Manufacturer.*;
import static model.enums.ShelfLife.*;

public class ManipulateClass {
    Product product1 = new Product(1, "Iphone 10", 777777, APPLE, 100000, ONE_YEAR, 10);
    Product product2 = new Product(2, "Galaxy", 777778, SAMSUNG, 200000, TWO_YEARS, 20);

    Product[] products = new Product[]{product1, product2};


    public Product searchByName(Product[] products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product searchByPrice(Product[] products, double price) {
        for (Product product : products) {
            if (product.getPrice() == price) {
                return product;
            }
        }
        return null;
    }

    public String getProductInfoByParamOfSearch(String paramName, String value) {

        return switch (paramName) {
            case "price" -> searchByPrice(products, Double.parseDouble(value)).toString();
            case "name" -> searchByName(products, value).toString();
            default -> "You entered an invalid parameter, enter 'name' or 'price'";
        };
    }


    public static void main(String[] args) {

        ManipulateClass m1 = new ManipulateClass();
        System.out.println("Search result is " + m1.getProductInfoByParamOfSearch("name", "Iphone 10"));
        System.out.println("Search result is " + m1.getProductInfoByParamOfSearch("price", "200000"));


    }
}
