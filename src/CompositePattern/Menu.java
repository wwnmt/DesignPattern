package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  菜单
 */
public class Menu extends MenuComponent {

    public ArrayList menuComponent = new ArrayList();
    private String name;
    private String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        this.menuComponent.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponent.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print(){
        System.out.println("\n" + getName());
        System.out.println("\n" + getDescription());
        System.out.println("---------------------");

        Iterator iterator = menuComponent.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent =
                    (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
