package com.mytodos.Services;

import java.util.ArrayList;
import java.util.List;

import com.mytodos.Entites.Entity;
import com.mytodos.Entites.Task;
import com.mytodos.Factories.PersistanceFactory;
import com.mytodos.Persistance.Persistance;

public class TaskService {
  /**
   * Returns all tasks from persistance.
   * 
   * @return void
   */
  public List<Task> getAllTasks() {
    Persistance persistance = PersistanceFactory.create();
    List<Entity> entites = persistance.getAll();
    List<Task> tasks = new ArrayList<Task>();

    // Sanity check to make sure only entites of instance Task is returned
    for (Entity entity : entites) {
      if(!(entity instanceof Task))
        continue;

      tasks.add((Task)entity);
    }

    return tasks;
  }

  public Task findTaskById(int id) {
    List<Task> tasks = getAllTasks();

    for (Task task : tasks) {
      if(task.getId() == id)
        continue;

      return task;
    }

    return null;
  }
}
