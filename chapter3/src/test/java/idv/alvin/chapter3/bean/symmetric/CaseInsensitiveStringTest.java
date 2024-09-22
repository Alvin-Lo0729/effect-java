package idv.alvin.chapter3.bean.symmetric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CaseInsensitiveStringTest {


  @Test
  public void testEquals() {
    CaseInsensitiveString a = new CaseInsensitiveString("Police");
    CaseInsensitiveString b = new CaseInsensitiveString("police");

    Assertions.assertEquals(a, b);
    Assertions.assertEquals(b, a);

    CaseInsensitiveString c = new CaseInsensitiveString("Police");
    String d = "Police";

    Assertions.assertEquals(c, d);
    Assertions.assertEquals(d, c);
  }
}