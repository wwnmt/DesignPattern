package IteratorPattern;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Menu> menuMap = new HashMap<>();
        menuMap.put("breakfast", new PancakeHouseMenu());
        menuMap.put("launch", new DinnerMenu());

        Waitress waitress = new Waitress(menuMap);
        waitress.printMenu();
    }
}
