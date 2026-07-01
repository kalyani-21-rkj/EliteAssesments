package com.stock;

public class TestStock {

    public static void main(String[] args) {

        Holder h = StockSingleton.getStock();
        h.viewQuote();

        Broker b = StockSingleton.getStock();
        b.getQuote();

        Exchange e = StockSingleton.getStock();
        e.setQuote();

        System.out.println(h == b);
        System.out.println(b == e);
    }
}