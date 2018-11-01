package IteratorPattern;

public class DinnerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    public boolean hasNext(){
        return (position <= menuItems.length && menuItems[position] != null);
    }

    public Object next(){
        MenuItem item = menuItems[position];
        position++;
        return item;
    }
}
