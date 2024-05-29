package seminar1.hw;

import seminar1.hw.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);
        VendingMachine vm = new WaterVendingMachine();
        System.out.println(vm.getProducts());
        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));
        System.out.println(vm.getProducts());
        vm.getProduct("Родники");
        System.out.println(vm.getProducts());
//============== HW=============
        HotDrinkMachine hm = initHotMachines();
        showHotMachinesMenu(hm.getProducts());
        hm.getProduct("Кофе");
        showHotMachinesMenu(hm.getProducts());
        hm.getProduct("Кофе");

    }

    public static HotDrinkMachine initHotMachines() {
        HotDrinkMachine hm = new HotDrinkMachine();
        Product hotDrink1 = new HotDrink("Чай черный", 50, LocalDate.now(), 90);
        Product hotDrink2 = new HotDrink("Чай зеленый", 55, LocalDate.of(2024, 5, 28), 95);
        Product hotDrink3 = new HotDrink("Кофе", 60, LocalDate.now(), 90);
        hm.addProducts(List.of(hotDrink1, hotDrink2, hotDrink3));
        System.out.println("Все напитки загружены в аппарат.");

        return hm;
    }

    public static void showHotMachinesMenu(List<Product> hot) {
        for (int i = 0; i < hot.size(); i++) {
            System.out.println(hot.get(i));
        }

    }
}
