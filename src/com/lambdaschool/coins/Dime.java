package com.lambdaschool.coins;

public class Dime extends Coin {

  public Dime() {
    super();
  }

  public Dime(int quantity) {
    super(quantity);
  }

  @Override
  public CoinType getCoinType() {
    return CoinType.DIME;
  }
}
