package idv.alvin.chapter3;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter3ApplicationTests {

  @Test
  void contextLoads() {

    LocalDateTime localDateTime=LocalDateTime.now();
    System.out.println(localDateTime.minusHours(69));
  }

}
