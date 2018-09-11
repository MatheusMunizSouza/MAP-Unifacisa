package br.com.unifacisa.map.builder;

public class Pizza {

  public static void main(String[] args) {
    PizzariaDirector pizzariaDirector = new PizzariaDirector(
        new PizzaChicagoBuilder());

    pizzariaDirector.construirPizza();
    PizzaProduct pizza = pizzariaDirector.getPizza();
    System.out.println("Dough: " + pizza.dough + "\nSauce: " + pizza.sauce
        + "\nCheese: " + pizza.cheese + "\nClams: "
        + pizza.clams);

    System.out.println();

    pizzariaDirector = new PizzariaDirector(new PizzaNYBuilder());
    pizzariaDirector.construirPizza();
    pizza = pizzariaDirector.getPizza();
    System.out.println("Dough: " + pizza.dough + "\nSauce: " + pizza.sauce
        + "\nCheese: " + pizza.cheese + "\nClams: "
        + pizza.clams);
  }
}
