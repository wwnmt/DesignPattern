package FactoryPattern;

public class App {

    public static void main(String[] argv){
        PizzaStore pizzaStore = new PizzaStore(new SimplePuzzaFactory());

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("clam");
    }
}
