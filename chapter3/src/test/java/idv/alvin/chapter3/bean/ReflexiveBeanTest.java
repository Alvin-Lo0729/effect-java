package idv.alvin.chapter3.bean;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReflexiveBeanTest {

  @Test
  void testEquals() {
    ReflexiveBean a = new ReflexiveBean("a", 1);
    Assertions.assertEquals(a, a);
  }

  @Test
  void testSet() {
    ReflexiveBean a = new ReflexiveBean("a", 1);
    Collection<ReflexiveBean> collection = new ArrayList<>();
    collection.add(a);
    Assertions.assertTrue(collection.contains(a));
  }
}