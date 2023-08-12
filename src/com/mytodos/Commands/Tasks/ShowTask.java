package com.mytodos.Commands.Tasks;

import com.mytodos.Display.Input;
import com.mytodos.Display.MenuBuilder;
import com.mytodos.Entites.Task;
import com.mytodos.Helpers.Display;
import com.mytodos.Services.TaskService;

public class ShowTask {
  public void execute(Task task) {
    Display.printSeparator();
    System.out.println("Name: " + task.getName());
    System.out.println("Content: " + task.getContent());
    Display.printSeparator();

    while(true) {
      MenuBuilder menuBuilder = new MenuBuilder();
      char key = menuBuilder
        .addItem('r', "Remove note")
        .addItem('a', "Abort")
        .print()
        .waitForResponse();

      String input = String.valueOf(key);

      if(input.equalsIgnoreCase("r")) {
        TaskService taskService = new TaskService();
        taskService.removeTask(task);
        break;
      }

      if(input.equalsIgnoreCase("a")) {
        break;
      }
    }
  }
}
