package com.lambdaschool.coins;

public class Quarter extends Coin {

  public Quarter() {
    super();
  }

  public Quarter(int quantity) {
    super(quantity);
  }

  @Override
  public CoinType getCoinType() {
    return CoinType.QUARTER;
  }
}
