package br.com.unifacisa.map.builder;

public class PizzaChicagoBuilder extends PizzaBuilder {

  @Override
  public void buildDough() {
    pizzaProduct.dough = "Thin Crust Dough";
  }

  @Override
  public void buildSauce() {
    pizzaProduct.sauce = "Mariana Sauce";
  }

  @Override
  public void buildClaims() {
    pizzaProduct.clams = "Fresh clams";
  }

  @Override
  public void buildCheese() {
    pizzaProduct.cheese = "Reggiano Cheese";
  }
}
