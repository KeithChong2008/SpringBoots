package com.hkjava.demo.demoresttemplate.model;

import lombok.Getter;

@Getter // Getter + No-args constructor
public class User {
  private long id;
  private String name;
  private String username;
  private String email;
  private Adderss address;
  private String phone;
  private String website;
  private Company company;

  @Getter
  public static class Adderss {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    @Getter
    public static class Geo {
      private String lat;
      private String lng;
    }
  }

  @Getter
  public static class Company {
    private String name;
    private String catchPhrase;
    private String bs;
  }

}
