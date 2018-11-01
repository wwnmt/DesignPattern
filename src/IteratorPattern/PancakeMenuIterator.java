package IteratorPattern;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {

    private ArrayList menuItems;
    private int position = 0;

    public PancakeMenuIterator(ArrayList menuItems){
        this.menuItems = menuItems;
    }

    public boolean hasNext(){
        return (position < menuItems.size() && menuItems.get(position) != null);
    }

    public Object next(){
        MenuItem item = (MenuItem) menuItems.get(position);
        position++;
        return item;
    }
}
