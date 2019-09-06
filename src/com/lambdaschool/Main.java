package com.lambdaschool;

import com.lambdaschool.coins.Dime;
import com.lambdaschool.coins.Dollar;
import com.lambdaschool.coins.Nickel;
import com.lambdaschool.coins.Penny;
import com.lambdaschool.coins.Quarter;

public class Main {

  public static void main(String[] args) {
    PiggyBank piggyBank = new PiggyBank();

    piggyBank.add(new Quarter());
    piggyBank.add(new Dime());
    piggyBank.add(new Dollar(5));
    piggyBank.add(new Nickel(3));
    piggyBank.add(new Dime(7));
    piggyBank.add(new Dollar());
    piggyBank.add(new Penny(10));

    piggyBank.displayContents();
    piggyBank.displayValue();

    piggyBank.remove(1.5);

    piggyBank.displayContents();
    piggyBank.displayValue();

    piggyBank.remove(3.38);

    piggyBank.displayContents();
    piggyBank.displayValue();
  }
}
