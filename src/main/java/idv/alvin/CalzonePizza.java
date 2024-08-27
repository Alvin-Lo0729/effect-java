package idv.alvin;

import lombok.Getter;

@Getter
public class CalzonePizza extends Pizza {

  private final boolean sauceInside;

  public CalzonePizza(Builder builder) {
    super(builder);
    this.sauceInside = builder.sauceInside;
  }

  public static class Builder extends Pizza.Builder<Builder> {

    private boolean sauceInside;

    public Builder(Size size) {
      super(size);
    }

    public Builder sauceInside(boolean sauceInside) {
      this.sauceInside = sauceInside;
      return this;
    }

    @Override
    Pizza build() {
      return new CalzonePizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

}
