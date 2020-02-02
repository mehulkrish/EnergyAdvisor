package com.example.energyadvisors;

public class Intention {
    private String desire;
    private int isBusiness;
    private int isConsumer;

    public Intention(String desire, int num, int num2) {
        this.desire = desire;
        isBusiness = num;
        isConsumer = num2;
    }
    // Setters based on the user preferences
    public String getDesire() {
        return desire;
    }
    public int getIsBusiness() {
         return isBusiness;
    }
    public int getIsConsumer() {
         return isConsumer;
    }
}
