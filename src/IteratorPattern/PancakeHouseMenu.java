package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    public ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancake with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancake with fried eggs, and sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancake made with Blueberry",
                true,
                3.49);
    }

    @SuppressWarnings("unchecked")
    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }

}
