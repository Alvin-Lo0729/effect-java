package idv.alvin;

public enum Suit {


  CLUB, SPADE, HEART, DIAMOND;

  private Suit()
  {
    System.out.println("Constructor called for : " +
        this.toString());
  }
  public void suitInfo()
  {
    System.out.println("Universal Suit");
  }
}
