package seminar1.hw.impl;

import seminar1.hw.Product;
import seminar1.hw.VendingMachine;

import java.util.List;

public class HotDrinkMachine extends VendingMachine {
    public HotDrinkMachine() {
        System.out.println("Аппарат горячих напитков включен!");
    }

    @Override
    public void addProducts(List<Product> products) {
        super.addProducts(products);
    }

    @Override
    public List<Product> getProducts() {
        System.out.println("В аппарате,на данный момент есть:");
        return super.getProducts();
    }

    @Override
    public Product getProduct(String name) {
//        Product product = super.getProduct(name);
        HotDrink product = (HotDrink) super.getProduct(name);
        if (product != null) {
            System.out.println("Наливаю " + product.getName() + " с температурой " + product.getTemp());
        }
        return product;
    }
}
