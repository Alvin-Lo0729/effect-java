package idv.alvin;

import java.util.Objects;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class Employee {

  private String lastName;// required
  private String firstName;// required
  private String gender;// required
  private Integer age;// optional
  private Integer tel;// optional
  private String address;// optional
  private Boolean single;// optional

  public Employee(Builder builder) {
    this.lastName = Objects.requireNonNull(builder.lastName);
    this.firstName = Objects.requireNonNull(builder.firstName);
    this.gender = StringUtils.isNotEmpty(builder.gender) ? builder.gender.toUpperCase() : "";
    this.age = builder.age;
    this.tel = builder.tel;
    this.address = Objects.toString(builder.address, "Taiwan");
    this.single = builder.single;
  }

  public static class Builder {

    private final String lastName;
    private final String firstName;
    private final String gender;

    private Integer age;
    private Integer tel;
    private String address;
    private Boolean single;

    public Builder(String lastName, String firstName, String gender) {
      this.lastName = lastName;
      this.firstName = firstName;
      this.gender = gender;
    }

    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    public Builder tel(Integer tel) {
      this.tel = tel;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder single(Boolean single) {
      this.single = single;
      return this;
    }

    public Employee build() {
      return new Employee(this);
    }
  }


}
