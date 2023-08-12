package com.mytodos.Display;

import java.util.ArrayList;
import java.util.List;

import com.mytodos.Helpers.Display;

public class MenuBuilder {
  private String header;
  private List<MenuItem> items = new ArrayList<MenuItem>();

  public MenuBuilder addHeader(String header) {
    this.header = header;
    return this;
  }

  public MenuBuilder addItem(char key, String text) {
    MenuItem item = new MenuItem();
    item.setKey(key);
    item.setText(text);

    this.items.add(item);
    return this;
  }

  public MenuBuilder print() {
    if(header != null) {
      System.out.println(header);
      Display.printSeparator();
    }

    items.forEach(item -> {
      String key = String.valueOf(item.getKey());
      String keyOutput = String.format("%s/%s) ", key.toUpperCase(), key.toLowerCase());
      System.out.println(keyOutput + item.getText());
    });

    Display.printSeparator();
    System.out.print("Enter: ");
    return this;
  }

  public char waitForResponse() {
    String input = Input.readAnswear();
    return input.charAt(0);
  }
}
