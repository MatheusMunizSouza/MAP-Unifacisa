package br.com.unifacisa.map.builder;

public class PizzariaDirector {

  private PizzaBuilder pizzaBuilder;

  public PizzariaDirector(PizzaBuilder pizzaBuilder) {
    this.pizzaBuilder = pizzaBuilder;
  }

  public void construirPizza() {
    pizzaBuilder.buildDough();
    pizzaBuilder.buildSauce();
    pizzaBuilder.buildCheese();
    pizzaBuilder.buildClaims();
  }

  public PizzaProduct getPizza() {
    return pizzaBuilder.getPizza();
  }
}
