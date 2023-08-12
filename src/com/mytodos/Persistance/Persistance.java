
/**
 * This is the main interface for persistance instances like
 * inMemory or Database persistance.
 */
package com.mytodos.Persistance;

import java.util.List;

import com.mytodos.Entites.Entity;

public interface Persistance {
  public Boolean add(Entity Item);
  public Entity findByIndex(int index);
  public List<Entity> getAll();
  public Boolean remove(Entity Item);
}
