package com.lambdaschool.coins;

public class Nickel extends Coin {

  public Nickel() {
    super();
  }

  public Nickel(int quantity) {
    super(quantity);
  }

  @Override
  public double getCoinValue() {
    return 0.05;
  }

  @Override
  public String getCoinName() {
    return "Nickel";
  }
}
