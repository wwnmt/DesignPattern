package IteratorPattern;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Menu, String> menuMap = new HashMap<>();
        menuMap.put(new PancakeHouseMenu(), "breakfast");
        menuMap.put(new DinnerMenu(), "launch");
        menuMap.put(new CafeMenu(), "dinner");

        Waitress waitress = new Waitress(menuMap);
        waitress.printMenu();
    }
}
