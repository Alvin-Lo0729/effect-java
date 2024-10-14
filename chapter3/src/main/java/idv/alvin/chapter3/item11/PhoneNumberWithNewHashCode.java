package idv.alvin.chapter3.item11;

public class PhoneNumberWithNewHashCode {

  private final short areaCode;
  private final short prefix;
  private final short lineNum;

  public PhoneNumberWithNewHashCode(int areaCode, int prefix, int lineNum) {
    this.areaCode = rangeCheck(areaCode, 999, "area code");
    this.prefix = rangeCheck(prefix, 999, "prefix");
    this.lineNum = rangeCheck(lineNum, 9999, "line num");
  }

  private static short rangeCheck(int lineNum, int i, String lineNum1) {
    if (lineNum < 0 || lineNum > i) {
      throw new IllegalArgumentException(lineNum1 + ": " + lineNum);
    }

    return (short) lineNum;
  }


  @Override
  public int hashCode() {
    int result = Short.hashCode(areaCode);
    result = 31 * result + Short.hashCode(prefix);
    result = 31 * result + Short.hashCode(lineNum);
    return result;
  }
}
