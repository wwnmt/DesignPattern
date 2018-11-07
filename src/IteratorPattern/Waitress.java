package IteratorPattern;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Map;

public class Waitress {
    private Map<Menu, String> menuMap;

    public Waitress(Map<Menu, String> menuMap){
        this.menuMap = menuMap;
    }

    public void printMenu(){
        for (Menu menu : menuMap.keySet()){
            System.out.println("\n-- " + menuMap.get(menu) + " -- ");
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + "$ -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
