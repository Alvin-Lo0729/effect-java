package idv.alvin.chapter3.bean.symmetric;

import java.util.Objects;


public record CaseInsensitiveString(String s) {

  public CaseInsensitiveString(String s) {
    this.s = Objects.requireNonNull(s);
  }

  @Override
  public boolean equals(Object x) {
    if (x instanceof CaseInsensitiveString) {
      return s.equalsIgnoreCase(((CaseInsensitiveString) x).s);
    }
    return false;
  }
}
