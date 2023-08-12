package com.mytodos;

import com.mytodos.Commands.MainMeny;
import com.mytodos.Display.Input;

class App {
  public static void main(String[] args) {
    MainMeny mainMeny = new MainMeny();

    Boolean keepRunning = true;
    while (keepRunning) {
      keepRunning = mainMeny.execute(); 
    }

    Input.destroy();
    System.out.println("\nHave a great day!");
  }
}
