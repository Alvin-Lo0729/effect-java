package idv.alvin.chapter3.bean.transitivity;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ColorPoint extends Point{

  private final Color color;
  public ColorPoint(int x, int y,Color color) {
    super(x, y);
    this.color=color;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ColorPoint cp)) {
      return false;
    }
    return super.equals(cp) &&cp.color==color;
  }
}
