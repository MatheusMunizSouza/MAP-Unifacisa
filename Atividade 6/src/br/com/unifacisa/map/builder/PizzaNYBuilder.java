package br.com.unifacisa.map.builder;

public class PizzaNYBuilder extends PizzaBuilder {

  @Override
  public void buildDough() {
    pizzaProduct.dough = "Thick Crust Dough";
  }

  @Override
  public void buildSauce() {
    pizzaProduct.sauce = "Plum Tomate Sauce";
  }

  @Override
  public void buildClaims() {
    pizzaProduct.clams = "Frozem clams";
  }

  @Override
  public void buildCheese() {
    pizzaProduct.cheese = "Mozzarela Cheese";
  }
}
