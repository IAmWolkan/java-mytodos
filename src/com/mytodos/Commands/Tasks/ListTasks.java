package com.mytodos.Commands.Tasks;

import java.util.List;

import com.mytodos.Commands.Display.Input;
import com.mytodos.Entites.Task;
import com.mytodos.Services.TaskService;

public class ListTasks {
  /**
   * Returns all tasks from persistance.
   * 
   * @return void
   */
  public void execute() {
    TaskService taskService = new TaskService();
    List<Task> tasks = taskService.getAllTasks();

    while(true) {
      for (Task task : tasks) {
        System.out.println(task.getId() + ". " + task.getName());
      }

      String input = Input.askQuestion("Select task to view or enter a to abort: ");

      if(input.equalsIgnoreCase("a"))
        break;

      Task task;
      try {
        int selectedId = Integer.parseInt(input);
        task = taskService.findTaskById(selectedId);
      } catch(NumberFormatException ex) {
        System.out.println("Incorrect input, try again.");
        continue;
      }

      if(task == null) {
        System.out.println("Could not find entity with entered id.");
        continue;
      }

      System.out.println("------------------------------------------\n");
      System.out.println("Name: "+task.getName());
      System.out.println("Content: "+task.getContent());
      System.out.println("------------------------------------------\n");
    }
  }
}
