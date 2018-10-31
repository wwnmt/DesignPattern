package FactoryPattern;

public class SimplePizzaFactory {

    public AbstractPizza createPizza(String type){
        AbstractPizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        }
        else{
            pizza = new Pizza();
        }
        return pizza;
    }
}
