package com.mytodos.Persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mytodos.Entites.Entity;

public class InMemory implements Persistance {
  private HashMap<Integer, Entity> Storage = new HashMap<Integer, Entity>();

  /**
   * Adds entity to memory storage
   * 
   * @param Entity Item
   * @return Boolean
   */
  public Boolean add(Entity Item) {
    try {
      Item.setId(this.getId());
      Storage.put(Item.getId(), Item);
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
    return new ArrayList<Entity>(Storage.values());
  }

  /**
   * Removes entity from storage
   * 
   * @param Entity Item
   * @return Boolean
   */
  public Boolean remove(Entity Item) {
    try{
      Storage.remove(Item.getId());
      return true;
    } catch(Exception ex) {
      // Todo: Add logging
      return false;
    }
  }

  /**
   * Reads the size of the storage and returnes the next Id in the list
   *  
   * @return int
   */
  private int getId() {
    return Storage.size() + 1;
  }
}
