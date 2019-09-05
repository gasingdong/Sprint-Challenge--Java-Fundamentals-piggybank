package com.lambdaschool.coins;

public class Penny extends Coin {

  public Penny() {
    super();
  }

  public Penny(int quantity) {
    super(quantity);
  }

  @Override
  public CoinType getCoinType() {
    return CoinType.PENNY;
  }
}
