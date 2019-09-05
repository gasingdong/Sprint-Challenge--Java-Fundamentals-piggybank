package com.lambdaschool;

import com.lambdaschool.coins.Quarter;

public class Main {

  public static void main(String[] args) {
    PiggyBank piggyBank = new PiggyBank();

    piggyBank.add(new Quarter());

    piggyBank.displayContents();
  }
}
