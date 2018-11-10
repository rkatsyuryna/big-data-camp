package com.epam.bigdata;

import org.json.simple.parser.ParseException;

public class Application {

  public static void main(String[] args) throws ParseException {
    JsonParser jsonParser = new JsonParser("src/main/resources/twitter.json");
    Twit twit = new Twit(
            jsonParser.getByName("text"),
            jsonParser.getByName("id_str")
    );

    Twit twitTest = new Twit(
            null,
            null
    );

    System.out.println(twit);
    System.out.println(twitTest);

    System.out.println(twit.returnBigger(twitTest));
    System.out.println(twitTest.returnBigger(twit));
  }
}
