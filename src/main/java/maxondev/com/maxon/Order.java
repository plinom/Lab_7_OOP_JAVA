package maxondev.com.maxon;

import java.util.ArrayList;
import java.util.List;

public class Order extends Item {
    private final List<Item> listOfItems = new ArrayList<>();
    void addItem(Item item) {
        listOfItems.add(item);
    }
    public double getPrice() {
        return listOfItems.stream().mapToDouble(Item::getPrice).sum();
    }
}
