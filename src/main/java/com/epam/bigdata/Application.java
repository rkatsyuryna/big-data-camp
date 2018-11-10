package com.epam.bigdata;

import org.json.simple.parser.ParseException;

public class Application {

  public static void main(String[] args) throws ParseException {
    JsonParser jsonParser = new JsonParser("src/main/resources/twitter.json");
    Twit twit = new Twit(
            jsonParser.getByName("text"),
            jsonParser.getByName("id_str")
    );

    System.out.println(twit);
  }
}
