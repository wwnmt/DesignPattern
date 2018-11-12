package CompositePattern;

public class App {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE", "Breakfast");
        MenuComponent dinnerMenu =
                new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of dinner");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancake with scrambled eggs, and toast",
                2.99,
                true));
        dinnerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                3.99,
                false));
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato and fries",
                3.29,
                true));
        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with canilla ics cream",
                2.99,
                true));
        dinnerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
