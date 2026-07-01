package com.stock;

public final class StockSingleton {

    private static Stock stock;

    private StockSingleton() {
    }

    public static Stock getStock() {

        if (stock == null) {
            stock = new Stock();
        }

        return stock;
    }
}