package com.epam.bigdata;

import com.sun.istack.internal.NotNull;

public class Twit {

  private String id;
  private String text;
  private int length;

  public Twit(@NotNull String text, String id) {
    this.text = text;
    this.id = id;
    //if text null - return 0
    this.length = text != null? text.length() : 0;
  }

  public int getLength() {
    return length;
  }

  public Twit returnBigger(Twit twit) {
      //return bigger Twit by twit.length
    return this.length > twit.length ? this : twit;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Twit{");
    sb.append("id='").append(id).append('\'');
    sb.append(", text='").append(text).append('\'');
    sb.append(", length=").append(length);
    sb.append('}');
    return sb.toString();
  }
}
