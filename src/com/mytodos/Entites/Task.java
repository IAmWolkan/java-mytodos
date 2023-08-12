package com.mytodos.Entites;

public class Task implements Entity {
  private int Id;
  private String Name;
  private String Content;

  public int getId() {
    return this.Id;
  }

  public String getName() {
    return this.Name;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  public String getContent() {
    return this.Content;
  }

  public void setContent(String Content) {
    this.Content = Content;
  }
}
