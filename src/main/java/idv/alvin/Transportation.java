package idv.alvin;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Transportation {

  Car("small", 100), Bus("medium", 200), Train("large", 300);
  private final String size;
  private final int speed;


}
