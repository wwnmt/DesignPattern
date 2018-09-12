package DecorationPattern;

public class Soy extends AbstractCondimentDecorator {

    AbstractBeverage beverage;

    public Soy(AbstractBeverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", " + getSize();
    }

    public size getSize(){
        return beverage.cupSize;
    }

    public double cost(){
        switch (getSize()){
            case GRANDE:
                return 0.20 + beverage.cost();
            case TALL:
                return 0.10 + beverage.cost();
            default:
                return 0.15 + beverage.cost();
        }
    }
}
