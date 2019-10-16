package ru.itpark.model;

public class OtherRate extends Rate {
    private int period;
    private String call;

    public OtherRate(String id, String name, String description, int price, String internet, int period, String call) {
        super(id, name, description, price, internet);
        this.period = period;
        this.call = call;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }
}
