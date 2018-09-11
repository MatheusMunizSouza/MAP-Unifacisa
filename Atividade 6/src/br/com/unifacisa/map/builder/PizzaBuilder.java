package br.com.unifacisa.map.builder;

public abstract class PizzaBuilder {

  PizzaProduct pizzaProduct = new PizzaProduct();

  public abstract void buildDough();
  public abstract void buildSauce();
  public abstract void buildClaims();
  public abstract void buildCheese();

  public PizzaProduct getPizza() {
    return this.pizzaProduct;
  }
}
