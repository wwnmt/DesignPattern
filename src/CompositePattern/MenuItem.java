package CompositePattern;


/**
 *  菜单项
 */
public class MenuItem extends MenuComponent {

    public String name;
    public String description;
    public double price;
    public boolean isVegetarian;

    public MenuItem(String name,
                    String description,
                    double price,
                    boolean isVegetarian){
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print(){
        System.out.print(getName());
        if (isVegetarian()){
            System.out.print(" (v) ");
        }
        System.out.print(getPrice() + "$");
        System.out.print("  -- " + getDescription());
    }
}
