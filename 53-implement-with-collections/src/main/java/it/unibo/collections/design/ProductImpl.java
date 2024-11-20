package it.unibo.collections.design;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product{
    private String name;
    private double quantity;

    public ProductImpl(String n, double q) {
        this.name = n;
        this.quantity = q;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }
}