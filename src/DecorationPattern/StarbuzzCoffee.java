package DecorationPattern;

public class StarbuzzCoffee {

    private static void display(AbstractBeverage beverage){
        System.out.println(beverage.getDescription() + " $" +
                beverage.cost());
    }

    public static void main(String[] argv){
        AbstractBeverage beverage = new Espresso();
        display(beverage);

        AbstractBeverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1.setSize(size.VENTI);
        beverage1 = new Soy(beverage1);
        display(beverage1);

        AbstractBeverage beverage2 = new Espresso();
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2.setSize(size.TALL);
        beverage2 = new Soy(beverage2);
        display(beverage2);
    }
}
