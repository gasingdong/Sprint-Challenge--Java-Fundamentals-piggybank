package com.lambdaschool.coins;

public class Quarter extends Coin {

  @Override
  public double getCoinValue() {
    return 0.25;
  }

  @Override
  public String getCoinName() {
    return "Quarter";
  }
}
