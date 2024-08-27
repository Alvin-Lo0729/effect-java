package idv.alvin;

import java.util.EnumSet;
import java.util.Set;
import lombok.Getter;

@Getter
public abstract class Pizza {

  public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

  public enum Size {
    SMALL, MEDIUM, LARGE
  }

  private final Set<Topping> toppings;
  private final Size size;

  abstract static class Builder<T extends Builder<T>> {

    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
    private final Size size;

    public Builder(Size size) {
      this.size = size;
    }


    public T addTopping(Topping topping) {
      toppings.add(topping);
      return self();
    }

    abstract Pizza build();

    protected abstract T self();
  }

  Pizza(Builder<?> builder) {
    this.toppings = builder.toppings.clone();
    this.size = builder.size;
  }
}
