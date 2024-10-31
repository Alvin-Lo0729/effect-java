package idv.alvin.chapter3.item11;


import idv.alvin.chapter3.bean.TestComparable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import org.apache.commons.collections4.comparators.ComparableComparator;
import org.junit.jupiter.api.Test;

public class PhoneNumberMapTest {

  @Test
  public void testInsertMap() {
    TestComparable testComparable = new TestComparable("abc", 333, "55", "1123");
    TestComparable testComparable2 = new TestComparable("zzz", 555, "55", "1123");

    List<TestComparable> list = Arrays.asList(testComparable, testComparable2);
    System.out.println("before sort: " + list);

    SortedSet<TestComparable> sortedSet = new TreeSet<>(COMPARATOR);
    sortedSet.add(testComparable2);
    sortedSet.add(testComparable);

    Comparator<TestComparable> cc = Comparator.comparing(TestComparable::getName,Comparator.reverseOrder())
        .thenComparing(TestComparable::getNumber)
        .thenComparing(TestComparable::getZipCode)
        .thenComparing(TestComparable::getAddress);
    list.sort(cc);

  }

  public static final Comparator<TestComparable> COMPARATOR =
      Comparator.comparing(new Function<TestComparable, String>() {
            @Override
            public String apply(TestComparable testComparable) {
              return testComparable.getName();
            }
          })
          .thenComparing(TestComparable::getNumber)
          .thenComparing(TestComparable::getZipCode)
          .thenComparing(TestComparable::getAddress);
}
