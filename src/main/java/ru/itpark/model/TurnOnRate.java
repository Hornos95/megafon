package ru.itpark.model;

public class TurnOnRate extends Rate {
    private int call;
    private int sms;
    private boolean cashback;

    public TurnOnRate(String id, String name, String description, int price, String internet, int call, int sms, boolean cashback) {
        super(id, name, description, price, internet);
        this.call = call;
        this.sms = sms;
        this.cashback = cashback;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }


    public boolean isCashback() {
        return cashback;
    }

    public void setCashback(boolean cashback) {
        this.cashback = cashback;
    }

}
