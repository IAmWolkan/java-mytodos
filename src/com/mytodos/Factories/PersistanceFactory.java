package com.mytodos.Factories;

import com.mytodos.Persistance.InMemory;
import com.mytodos.Persistance.Persistance;

public class PersistanceFactory {
  private static Persistance instance;

  /**
   * Creates instance of persistance to be shared system-wide
   * @return Persistance
   */
  public static Persistance create() {
    if(instance != null)
      return instance;

    instance = new InMemory();
    return instance;
  }
}
