package com.lambdaschool.coins;

public class Quarter extends Coin {

  public Quarter() {
    super();
  }

  public Quarter(int quantity) {
    super(quantity);
  }

  @Override
  public double getCoinValue() {
    return 0.25;
  }

  @Override
  public String getCoinName() {
    return "Quarter";
  }
}
