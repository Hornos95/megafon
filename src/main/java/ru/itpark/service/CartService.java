package ru.itpark.service;

import ru.itpark.model.OtherDevice;
import ru.itpark.model.OtherRate;
import ru.itpark.model.Rate;
import ru.itpark.model.TurnOnRate;

public class CartService {
private Rate[] rates = new Rate[10];
private int size;
public void add(Rate rate){
rates[size++]= rate;
if (rate instanceof TurnOnRate){
TurnOnRate turnOn=(TurnOnRate) rate;
}
if (rate instanceof OtherDevice){
OtherDevice device=(OtherDevice) rate;
}
if (rate instanceof OtherRate){
OtherRate otherRate=(OtherRate) rate;
}
}

    public Rate[] getRates() {
        return rates;
    }

    public void setRates(Rate[] rates) {
        this.rates = rates;
    }

}
