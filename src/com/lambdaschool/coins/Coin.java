package com.lambdaschool.coins;

public abstract class Coin {

  private int quantity;

  public Coin() {
    this.quantity = 1;
  }

  public Coin(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void add(int amount) {
    quantity += amount;
  }

  public void remove(int amount) {
    quantity -= amount;
  }

  public double getTotalValue() {
    return quantity * getCoinValue();
  }

  public abstract double getCoinValue();
}
