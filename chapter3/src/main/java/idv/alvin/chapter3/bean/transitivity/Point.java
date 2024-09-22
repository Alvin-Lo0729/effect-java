package idv.alvin.chapter3.bean.transitivity;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Point {

  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Point p)) {
      return false;
    }
    return p.x == x && p.y == y;
  }

}
