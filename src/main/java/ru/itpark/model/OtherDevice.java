package ru.itpark.model;

public class OtherDevice extends Rate {
    private int periodMonth;

    public OtherDevice(String id, String name, String description, int price, String internet, int periodMonth) {
        super(id, name, description, price, internet);
        this.periodMonth = periodMonth;
    }

    public int getPeriodMonth() {
        return periodMonth;
    }

    public void setPeriodMonth(int periodMonth) {
        this.periodMonth = periodMonth;
    }
}
