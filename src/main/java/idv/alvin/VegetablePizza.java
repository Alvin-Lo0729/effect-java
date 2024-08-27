package idv.alvin;

import lombok.Getter;

@Getter
public class VegetablePizza extends Pizza {





  private VegetablePizza(Builder builder) {
    super(builder);

  }


  public static class Builder extends Pizza.Builder<Builder> {


    public Builder(Size size) {
      super(size);
    }

    @Override
    Pizza build() {
      return new VegetablePizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }


  }
}