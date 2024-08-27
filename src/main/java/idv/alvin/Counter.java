package idv.alvin;

public class Counter {

  private Integer count;

  private Counter() {
    System.out.println("init counter");
    this.count = 0;
  }

  private static final class UniqueInstanceHolder {

    private static final Counter uniqueInstance = new Counter();
  }

  public static Counter getInstance() {
    return UniqueInstanceHolder.uniqueInstance;
  }

  public synchronized Integer add() {
    return ++count;
  }

}