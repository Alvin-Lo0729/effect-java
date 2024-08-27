package idv.alvin;

import java.util.function.Function;

public class SoulMate {

  private volatile Function<String, Integer> stringIntegerFunction;

  private SoulMate() {
    stringIntegerFunction = String::length;
  }

  private static class Holder {

    private static final SoulMate INSTANCE = new SoulMate();
  }

  public static SoulMate getInstance() {

    return Holder.INSTANCE;
  }

  public synchronized Function<String, Integer> getStringIntegerFunction() {
    return stringIntegerFunction;
  }

  public synchronized  void setStringIntegerFunction(
      Function<String, Integer> stringIntegerFunction) {
    this.stringIntegerFunction = stringIntegerFunction;
  }
}