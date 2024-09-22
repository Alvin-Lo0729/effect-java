package idv.alvin.chapter3.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ReflexiveBean {

  private String a;
  private Integer b;

  @Override
  public boolean equals(Object x) {
    System.out.println("ReflexiveBean.equals() called");
    if (x == null) {
      return false;
    }
    if (x == this) {
      return false;
    }
    if (x.getClass() != this.getClass()) {
      return false;
    }
    ReflexiveBean that = (ReflexiveBean) x;
    return this.a.equals(that.a) && this.b.equals(that.b);
  }

}
