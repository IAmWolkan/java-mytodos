package com.mytodos.Commands.Tasks;

import com.mytodos.Commands.Display.Input;
import com.mytodos.Entites.Task;
import com.mytodos.Factories.PersistanceFactory;
import com.mytodos.Persistance.Persistance;

public class AddTask {
  /**
   * Adds task to system
   * 
   * @return Boolean 
   */
  public Boolean execute() {
    try {
      Task task = new Task();

      String name = Input.askQuestion("What should the name of the task be?\nName: ");
      task.setName(name);
      
      String content = Input.askQuestion("What should the content of the task be?\nContent: ");
      task.setContent(content);

      Persistance persistance = PersistanceFactory.create();
      persistance.add(task);

      return true;
    } catch(Exception ex) {
      // Todo: Add logging
      return false;
    }
  }
}
