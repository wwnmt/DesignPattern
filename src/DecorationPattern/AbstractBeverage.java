package DecorationPattern;

enum size{
    TALL, GRANDE, VENTI
}

public abstract class AbstractBeverage {

    String description = "Unknown Beverage";
    size cupSize = size.VENTI;

    public String getDescription(){
        return description;
    }

    public void setSize(size cupSize){
        this.cupSize = cupSize;
    }

    public abstract double cost();
}
