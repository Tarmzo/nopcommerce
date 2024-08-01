package Basics;

import java.util.ArrayList;
import java.util.List;

public class CartItems {
    private List<ComputerItems> items;

    public CartItems() {
        items = new ArrayList<>();
    }

    public void addItem(ComputerItems item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (ComputerItems item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public boolean validateTotal(double expectedTotal) {
        return calculateTotal() == expectedTotal;
    }

    public void printItems() {
        for (ComputerItems item : items) {
            System.out.println(item);
        }
    }
}