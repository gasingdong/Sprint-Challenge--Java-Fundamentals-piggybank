package com.lambdaschool.coins;

public class Nickel extends Coin {

  public Nickel() {
    super();
  }

  public Nickel(int quantity) {
    super(quantity);
  }

  @Override
  public CoinType getCoinType() {
    return CoinType.NICKEL;
  }
}
