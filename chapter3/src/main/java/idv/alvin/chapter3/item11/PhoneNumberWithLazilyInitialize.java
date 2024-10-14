package idv.alvin.chapter3.item11;

public class PhoneNumberWithLazilyInitialize {

  private final short areaCode;
  private final short prefix;
  private final short lineNum;
  private int hashCode;

  public PhoneNumberWithLazilyInitialize(short areaCode, short prefix, short lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (hashCode == 0) {
      result = Short.hashCode(areaCode);
      result = 31 * result + Short.hashCode(prefix);
      result = 31 * result + Short.hashCode(lineNum);
      hashCode = result;
    }
    return result;
  }

}
