package com.epam.bigdata;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Application {

  public static void main(String[] args) throws IOException, ParseException {
    JsonParser jsonParser = new JsonParser("src/main/resources/twitter.json");

    System.out.println(jsonParser.getByName("text"));
  }
}
