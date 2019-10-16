package ru.itpark.model;

public class TurnOn extends Rate {
    private int call;
    private int SMS;
    private boolean cashback;

    public TurnOn(String id, String name, String description, int price, String internet, int call, int SMS, boolean cashback) {
        super(id, name, description, price, internet);
        this.call = call;
        this.SMS = SMS;
        this.cashback = cashback;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public int getSMS() {
        return SMS;
    }

    public void setSMS(int SMS) {
        this.SMS = SMS;
    }


    public boolean isCashback() {
        return cashback;
    }

    public void setCashback(boolean cashback) {
        this.cashback = cashback;
    }

}
