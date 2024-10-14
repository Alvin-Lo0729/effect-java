package idv.alvin.chapter3.item11;

public final class PhoneNumber {

  private final short areaCode, prefix, lineNum;

  public PhoneNumber(int areaCode, int prefix, int lineNum) {
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
    return super.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof PhoneNumber pn)) {
      return false;
    }
    return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
  }

}
