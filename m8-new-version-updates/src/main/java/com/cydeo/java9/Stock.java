package com.cydeo.java9;

import java.math.BigDecimal;

public class Stock {
    private final String name;
    private final BigDecimal value;

    public Stock(String name, BigDecimal value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
