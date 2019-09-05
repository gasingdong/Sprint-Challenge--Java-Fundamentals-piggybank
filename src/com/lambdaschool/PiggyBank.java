package com.lambdaschool;

import com.lambdaschool.coins.Coin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PiggyBank {

  private List<Coin> order;

  public PiggyBank() {
    this.order = new ArrayList<>();
  }

  public void add(Coin coin) {
    order.add(coin);
  }

  public void displayContents() {
    order.forEach(Coin::displayQuantity);
  }
}
