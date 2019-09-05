package com.lambdaschool;

import com.lambdaschool.coins.Coin;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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

  public void displayValue() {
    DecimalFormat fp = new DecimalFormat("$###,###.00");
    double value = 0;

    for (Coin coin : order) {
      value += coin.getTotalValue();
    }

    System.out.println("The piggy bank holds " + fp.format(value));
  }
}
