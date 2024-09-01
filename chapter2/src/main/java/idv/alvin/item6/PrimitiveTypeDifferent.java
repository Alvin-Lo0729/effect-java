package idv.alvin.item6;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;

public class PrimitiveTypeDifferent {

  public static void main(String[] args) {
    StopWatch stopWatch = StopWatch.createStarted();
    Long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum += i;
    }
    System.out.println(sum);
    System.out.println("step1:" + stopWatch.getTime(TimeUnit.MILLISECONDS));
    stopWatch.reset();

    stopWatch.start();
    long sum2 = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum2 += i;
    }
    System.out.println(sum2);
    System.out.println("step2:" + stopWatch.getTime(TimeUnit.MILLISECONDS));

    stopWatch.reset();
    stopWatch.start();
    Long sum3 = 0L;
    for (Long i = 0L; i < Integer.MAX_VALUE; i++) {
      sum3 += i;
    }
    System.out.println(sum3);
    System.out.println("step3:" + stopWatch.getTime(TimeUnit.MILLISECONDS));

    stopWatch.reset();
    stopWatch.start();
    long sum4 = 0L;
    for (Long i = 0L; i < Integer.MAX_VALUE; i++) {
      sum4 += i;
    }
    System.out.println(sum4);
    System.out.println("step4:" + stopWatch.getTime(TimeUnit.MILLISECONDS));
  }

}
