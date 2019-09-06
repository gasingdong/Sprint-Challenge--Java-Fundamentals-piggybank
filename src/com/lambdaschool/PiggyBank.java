package com.lambdaschool;

import com.lambdaschool.coins.Coin;
import com.lambdaschool.coins.CoinType;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PiggyBank {

  private List<Coin> contents;

  public PiggyBank() {
    this.contents = new ArrayList<>();
  }

  public void add(Coin coin) {
    contents.add(coin);
  }

  public void remove(double amount) {
    double removedAmount = 0;
    System.out.println("Remove " + amount);
    int dollars = (int) Math.floor(amount);
    System.out.println("Take " + dollars + " Dollars");
    amount -= dollars;
    amount = Math.round(amount * 100.0) / 100.0;
    System.out.println("Remaining: " + amount);
    int quarters = (int) Math.floor(amount / 0.25);
    System.out.println("Take " + quarters + " Quarters");
    amount -= quarters * 0.25;
    System.out.println("Remaining: " + amount);
    int dimes = (int) Math.floor(amount / 0.1);
    System.out.println("Take " + dimes + " Dimes");
    amount -= dimes * 0.1;
    System.out.println("Remaining: " + amount);
    int nickels = (int) Math.floor(amount / 0.05);
    System.out.println("Take " + nickels + " Nickels");
    amount -= nickels * 0.5;
    System.out.println("Remaining: " + amount);
    int pennies = (int) Math.floor(amount / 0.01);
    System.out.println("Take " + pennies + " Pennies");

    for (Coin coin: contents) {
      if (coin.getCoinType() == CoinType.DOLLAR) {
        int toRemove = Math.min(dollars, coin.getQuantity());
        dollars -= toRemove;
        coin.setQuantity(coin.getQuantity() - toRemove);
        removedAmount += toRemove * coin.getCoinType().getValue();
      }
    }

    if (dollars > 0) {
      quarters += dollars * 4;
    }

    for (Coin coin: contents) {
      if (coin.getCoinType() == CoinType.QUARTER) {
        int toRemove = Math.min(quarters, coin.getQuantity());
        quarters -= toRemove;
        coin.setQuantity(coin.getQuantity() - toRemove);
        removedAmount += toRemove * coin.getCoinType().getValue();
      }
    }

    if (quarters > 0) {
      dimes += quarters * 2;
      nickels += quarters;
    }

    for (Coin coin: contents) {
      if (coin.getCoinType() == CoinType.DIME) {
        int toRemove = Math.min(dimes, coin.getQuantity());
        dimes -= toRemove;
        coin.setQuantity(coin.getQuantity() - toRemove);
        removedAmount += toRemove * coin.getCoinType().getValue();
      }
    }

    if (dimes > 0) {
      nickels += dimes * 2;
    }

    for (Coin coin: contents) {
      if (coin.getCoinType() == CoinType.NICKEL) {
        int toRemove = Math.min(nickels, coin.getQuantity());
        nickels -= toRemove;
        coin.setQuantity(coin.getQuantity() - toRemove);
        removedAmount += toRemove * coin.getCoinType().getValue();
      }
    }

    if (nickels > 0) {
      pennies += nickels * 5;
    }

    for (Coin coin: contents) {
      if (coin.getCoinType() == CoinType.PENNY) {
        int toRemove = Math.min(pennies, coin.getQuantity());
        pennies -= toRemove;
        coin.setQuantity(coin.getQuantity() - toRemove);
        removedAmount += toRemove * coin.getCoinType().getValue();
      }
    }

    contents.removeIf(coin -> coin.getQuantity() == 0);

    DecimalFormat fp = new DecimalFormat("$###,###.00");
    System.out.println("Removed " + fp.format(removedAmount));
  }

  public void displayContents() {
    contents.forEach(Coin::displayQuantity);
  }

  public void displayValue() {
    DecimalFormat fp = new DecimalFormat("$###,###.00");
    double value = 0;

    for (Coin coin : contents) {
      value += coin.getTotalValue();
    }

    System.out.println("The piggy bank holds " + fp.format(value));
  }
}
