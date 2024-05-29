package seminar1.hw.impl;

import seminar1.hw.Product;
import seminar1.hw.VendingMachine;

import java.util.List;

public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }
}
