package com.lambdaschool.coins;

public class Dollar extends Coin {

  public Dollar() {
    super();
  }

  public Dollar(int quantity) {
    super(quantity);
  }

  @Override
  public void displayQuantity() {
    System.out.println("$" + getQuantity());
  }

  @Override
  public CoinType getCoinType() {
    return CoinType.DOLLAR;
  }
}
