package com.mytodos.Commands.Tasks;

import com.mytodos.Commands.Display.Input;
import com.mytodos.Entites.Task;
import com.mytodos.Services.TaskService;

public class ShowTask {
  public void execute(Task task) {
    System.out.println("------------------------------------------\n");
    System.out.println("Name: "+task.getName());
    System.out.println("Content: "+task.getContent());
    System.out.println("------------------------------------------\n");

    while(true) {
      String input = Input.askQuestion("R) Remove note\nA) Abort\nChoice: ");

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
