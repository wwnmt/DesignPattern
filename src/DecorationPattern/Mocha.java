package DecorationPattern;

public class Mocha extends AbstractCondimentDecorator {

    AbstractBeverage beverage;

    public Mocha(AbstractBeverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return .20 + beverage.cost();
    }
}
