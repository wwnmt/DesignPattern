package IteratorPattern;

import java.util.Map;

public class Waitress {
    private Map<String, Menu> menuMap;

    public Waitress(Map<String, Menu> menuMap){
        this.menuMap = menuMap;
    }

    public void printMenu(){
        Iterator pancakeIterator = menuMap.get("breakfast").createIterator();
        Iterator dinnerIterator = menuMap.get("launch").createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLAUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
