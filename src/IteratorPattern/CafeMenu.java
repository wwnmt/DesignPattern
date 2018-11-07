package IteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu(){
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato and fries",
                true,
                3.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                true,
                3.29);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                3.99);
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator(){
        return menuItems.values().iterator();
    }
}
