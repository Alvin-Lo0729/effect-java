package idv.alvin.chapter3.bean;

import idv.alvin.chapter3.item11.PhoneNumberMapTest;
import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class TestComparable implements Comparable<TestComparable> {

  private String name;
  private Integer number;
  private String address;
  private String zipCode;



  @Override
  public int compareTo(TestComparable o) {
    return PhoneNumberMapTest.COMPARATOR.compare(this, o);
  }
}
