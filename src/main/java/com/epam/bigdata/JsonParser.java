package com.epam.bigdata;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonParser {

  private String filePath;

  private FileReader reader;
  private JSONParser jsonParser;
  private JSONObject jsonObject;

  public JsonParser(String filePath) throws ParseException {
    this.filePath = filePath;
    try {
      this.reader = new FileReader(filePath);
      this.jsonParser = new JSONParser();
      this.jsonObject = (JSONObject) jsonParser.parse(reader);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public String getByName(String name) {
    return (String) jsonObject.get(name);
  }

  public JSONObject getJsonObject() {
    return jsonObject;
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
}
