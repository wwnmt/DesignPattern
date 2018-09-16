package FactoryPattern;

public class PizzaStore {

    private SimplePuzzaFactory factory;

    public PizzaStore(SimplePuzzaFactory factory){
        this.factory = factory;
    }

    public AbstractPizza orderPizza(String type){
        AbstractPizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.getType();
        return pizza;
    }
}
