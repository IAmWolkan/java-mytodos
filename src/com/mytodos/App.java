package com.mytodos;

import com.mytodos.Commands.Display.Input;
import com.mytodos.Commands.Display.PrintMenu;
import com.mytodos.Commands.Tasks.AddTask;
import com.mytodos.Commands.Tasks.ListTasks;

class App {
  public static void main(String[] args) {
    while (true) {
      PrintMenu printMenu = new PrintMenu();
      printMenu.execute();

      String input = Input.askQuestion("");
      
      if(input.equalsIgnoreCase("a")) {
        AddTask command = new AddTask();
        command.execute();
      }

      if(input.equalsIgnoreCase("s")) {
        ListTasks listTasks = new ListTasks();
        listTasks.execute();
      }

      if(input.equalsIgnoreCase("x")) {
        break;
      }
    }

    Input.destroy();
    System.out.println("\nHave a great day!");
  }
}
