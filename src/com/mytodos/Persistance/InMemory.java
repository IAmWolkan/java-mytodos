package com.mytodos.Persistance;

import java.util.ArrayList;
import java.util.List;

import com.mytodos.Entites.Entity;

public class InMemory implements Persistance {
  private List<Entity> Storage = new ArrayList<Entity>();

  /**
   * Adds entity to memory storage
   * 
   * @param Entity Item
   * @return Boolean
   */
  public Boolean add(Entity Item) {
    try {
      Storage.add(Item);
      return true;
    } catch(Exception ex) {
      // Todo: Add logging
      return false;
    }
  }

  /**
   * Finds entity in storage by index
   * 
   * @param int index
   * @return Entity
   */
  public Entity findByIndex(int index) {
    try {
      return Storage.get(index);
    } catch(Exception ex) {
      // Todo: Add logging
      return null;
    }
  }

  /**
   * Returns all results from storage
   * 
   * @return List<Entity>
   */
  public List<Entity> getAll() {
    return Storage;
  }

  /**
   * Removes entity from storage
   * 
   * @param Entity Item
   * @return Boolean
   */
  public Boolean remove(Entity Item) {
    try{
      Storage.remove(Item);
      return true;
    } catch(Exception ex) {
      // Todo: Add logging
      return false;
    }
  }
}
