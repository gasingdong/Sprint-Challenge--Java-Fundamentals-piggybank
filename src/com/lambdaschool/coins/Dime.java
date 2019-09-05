package com.lambdaschool.coins;

public class Dime extends Coin {

  public Dime() {
    super();
  }

  public Dime(int quantity) {
    super(quantity);
  }

  @Override
  public double getCoinValue() {
    return 0.1;
  }

  @Override
  public String getCoinName() {
    return "Dime";
  }
}
