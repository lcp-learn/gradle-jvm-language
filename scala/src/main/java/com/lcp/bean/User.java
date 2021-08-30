package com.lcp.bean;

import java.io.Serializable;

/**
 * desc:    <br/>
 *
 * @author lichunpeng
 * @since 2021/7/26-11:05
 */
public class User implements Serializable {

  private static final long serialVersionUID = -1320409324211714150L;
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public final void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public final void setAge(int age) {
    this.age = age;
  }
}
