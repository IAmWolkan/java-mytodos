package com.mytodos.Commands;

import com.mytodos.Commands.Tasks.AddTask;
import com.mytodos.Commands.Tasks.ListTasks;
import com.mytodos.Display.Input;
import com.mytodos.Display.MenuBuilder;

public class MainMeny {
  public Boolean execute() {
    MenuBuilder builder = new MenuBuilder();
      char key = builder
        .addHeader("What do you want to do?")
        .addItem('A', "Add note")
        .addItem('S', "Show notes")
        .addItem('X', "Exit")
        .print()
        .waitForResponse();

      String input = String.valueOf(key);
      
      if(input.equalsIgnoreCase("a")) {
        AddTask command = new AddTask();
        command.execute();
      }

      if(input.equalsIgnoreCase("s")) {
        ListTasks listTasks = new ListTasks();
        listTasks.execute();
      }

      if(input.equalsIgnoreCase("x")) {
        return false;
      }

      return true;
  }
}
