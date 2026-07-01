package com.stock;

public class Stock implements Broker, Holder, Exchange {

    @Override
    public void getQuote() {
        System.out.println("Getting stock quote...");
    }

    @Override
    public void viewQuote() {
        System.out.println("Viewing stock quote...");
    }

    @Override
    public void setQuote() {
        System.out.println("Setting stock quote...");
    }
}