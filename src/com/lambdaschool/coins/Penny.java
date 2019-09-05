package com.lambdaschool.coins;

public class Penny extends Coin {

  public Penny() {
    super();
  }

  public Penny(int quantity) {
    super(quantity);
  }

  @Override
  public double getCoinValue() {
    return 0.01;
  }

  @Override
  public String getCoinName() {
    return "Penny";
  }
}
