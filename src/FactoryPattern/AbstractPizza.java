package FactoryPattern;

public abstract class AbstractPizza {

    public void prepare(){
        System.out.println("prepare...");
    }

    public void bake(){
        System.out.println("bake...");
    }

    public void cut(){
        System.out.println("cut...");
    }

    public void box(){
        System.out.println("box...");
    }

    public abstract void getType();
}
