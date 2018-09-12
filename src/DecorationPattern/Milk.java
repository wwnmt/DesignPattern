package DecorationPattern;

public class Milk extends AbstractCondimentDecorator {

    AbstractBeverage beverage;

    public Milk(AbstractBeverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Milk";
    }

    public double cost(){
        return 0.30 + beverage.cost();
    }
}
