package seminar1.hw.impl;

import seminar1.hw.Product;

import java.time.LocalDate;
import java.util.List;

public class HotDrink extends Product {
    private int temp;

    public HotDrink(String name, double price, LocalDate releaseDate, int temp) {
        super(name, price, releaseDate);
        this.temp = temp;
        System.out.println("Напиток ( " + name + " ) добавлен.");
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "          " + name +
                ", Цена = " + price +
                ", Дата изготовления = " + releaseDate +
                ", Температура = " + temp;
    }
}
