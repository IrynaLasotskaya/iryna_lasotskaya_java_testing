package task2;

public class Boeing extends Aviacompany {
    Boeing( int quantityCargo, int quantityPeople,  String name, int rangeOfFlight) {
        super(quantityCargo,quantityPeople,name,rangeOfFlight);
        this.quantityCargo = quantityCargo;
        this.quantityPeople = quantityPeople;
        this.name = name;
        overallQuantity=quantityCargo+quantityPeople;
    }

}
