package idv.alvin.chapter3.bean.transitivity;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ColorPoint2 {

  private final Point point;
  private final Color color;

  public ColorPoint2(int x, int y, Color color) {
    point = new Point(x, y);
    this.color = color;
  }
  public Point asPoint() {
    return point;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ColorPoint2 cp)) {
      return false;
    }
    return this.point.equals(cp.point)&& this.color.equals(cp.color);
  }
}
