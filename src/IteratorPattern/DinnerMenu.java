package IteratorPattern;


public class DinnerMenu implements Menu{
    private static final int MAX_ITEMS = 6;
    private int numOfItems = 0;
    public MenuItem[] menuItems;

    public DinnerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);

        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                3.99);

        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                true,
                3.29);
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        if (numOfItems >= MAX_ITEMS){
            System.err.println("Sorry, the menu is full!");
        } else {
            menuItems[numOfItems] = menuItem;
            numOfItems++;
        }
    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}
