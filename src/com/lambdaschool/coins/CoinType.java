package com.lambdaschool.coins;

public enum CoinType {
  DOLLAR(1.00, "Dollar"),
  QUARTER(0.25, "Quarter"),
  DIME(0.1, "Dime"),
  NICKEL(0.05, "Nickel"),
  PENNY(0.01, "Penny");

  double value;
  String name;

  CoinType(double value, String name) {
    this.value = value;
    this.name = name;
  }

  public double getValue() {
    return value;
  }

  public String getName() {
    return name;
  }
}
