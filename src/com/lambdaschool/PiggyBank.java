package com.lambdaschool;

import com.lambdaschool.coins.Coin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PiggyBank {

  private List<Coin> order;
  private Map<Coin, Integer> contents;

  public PiggyBank() {
    this.order = new ArrayList<>();
    this.contents = new HashMap<>();
  }
}
