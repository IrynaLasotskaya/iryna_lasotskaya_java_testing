package task2;

/**
 * Created by Admin on 08.05.2017.
 */
public class Airbus extends Aviacompany {
    Airbus( int quantityCargo, int quantityPeople,  String name, int rangeOfFlight) {
        super(quantityCargo,quantityPeople,name, rangeOfFlight);
        this.quantityCargo = quantityCargo;
        this.quantityPeople = quantityPeople;
        this.name = name;
        overallQuantity=quantityCargo+quantityPeople;

    }}


