package br.com.unifacisa.abstractfactory.map;

class PizzaStoreAF {

  public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

  }

  // Concrete Factory
  public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
      return new ThinCrustDough();
    }

    public Sauce createSauce() {
      return new MarinaraSauce();
    }

    public Cheese createCheese() {
      return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
      Veggies veggies[] = { new BlackOlives(),
          new Spinach(),
          new Eggplant() };
      return veggies;
    }

    public Pepperoni createPepperoni() {
      return new SlicedPepperoni();
    }

    public Clams createClam() {
      return new FreshClams();
    }
  }

  public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
      return new ThickCrustDough();
    }

    public Sauce createSauce() {
      return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
      return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
      Veggies veggies[] = { new BlackOlives(),
          new Spinach(),
          new Eggplant() };
      return veggies;
    }

    public Pepperoni createPepperoni() {
      return new SlicedPepperoni();
    }

    public Clams createClam() {
      return new FrozemClams();
    }
  }

  // Parts of Pizza
  public interface Clams {
    public String toString();
  }

  public interface Cheese {
    public String toString();
  }

  public interface Sauce {
    public String toString();
  }

  public interface Dough {
    public String toString();
  }

  public interface Pepperoni {
    public String toString();
  }

  public interface Veggies {
    String toString();
  }

  public class FreshClams implements Clams {

    public String toString() {
      return "Fresh Clams from Long Island Sound";
    }
  }

  public class FrozemClams implements Clams {
    public String toString() {
      return "Frozem Clams from Long Island Sound";
    }
  }

  public class ReggianoCheese implements Cheese {

    public String toString() {
      return "Reggiano Cheese";
    }
  }

  public class MozzarellaCheese implements Cheese {
    public String toString() {
      return "Mozzarella Cheese";
    }
  }

  public class MarinaraSauce implements Sauce {
    public String toString() {
      return "Marinara Sauce";
    }
  }

  public class PlumTomatoSauce implements Sauce {
    public String toString() {
      return "Plum tomato Sauce";
    }
  }

  public class ThinCrustDough implements Dough {
    public String toString() {
      return "Thin Crust Dough";
    }
  }

  public class ThickCrustDough implements Dough {
    public String toString() {
      return "Thick Crust Dough";
    }
  }

  public class SlicedPepperoni implements Pepperoni {
    public String toString() {
      return "Sliced Pepperoni";
    }
  }

  public class BlackOlives implements Veggies {
    public String toString() {
      return "Black Olives Veggie";
    }
  }

  public class Spinach implements Veggies {
    public String toString() {
      return "Spinach Veggie";
    }
  }

  public class Eggplant implements Veggies {
    public String toString() {
      return "Eggplant Veggie";
    }
  }
}

