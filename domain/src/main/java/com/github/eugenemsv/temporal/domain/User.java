package com.github.eugenemsv.temporal.domain;

import java.time.Year;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode(of = {"firstName", "birthYear", "lastName", "email"})
public class User {

  private final String firstName;

  private final Year birthYear;

  private final String key;

  private final String email;

  private final String lastName;

  private final Integer version;

  public static String buildKey(String firstName, Year birthYear) {
    return firstName + "_" + birthYear;
  }
}
