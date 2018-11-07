package IteratorPattern;

import java.util.Calendar;
import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    public boolean hasNext(){
        return (position <= menuItems.length && menuItems[position] != null);
    }

    public Object next(){
        MenuItem item = menuItems[position];
        position++;
        return item;
    }

    public void remove(){
        if (position <= 0){
            throw new IllegalThreadStateException
                    ("You can't remove an item until you have done at least one next()");
        }
        if (menuItems[position-1] != null){
            for (int i=position-1; i < (menuItems.length-1); i++){
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
