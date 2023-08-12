package com.mytodos.Commands.Display;

import java.util.Scanner;

public class Input {
  private static Scanner scanner;

  /**
   * Prints out the question from argument and reads answear from user
   * @param question
   * @return String
   */
  public static String askQuestion(String question) {
    init();
    System.out.print(question);

    String answear = scanner.nextLine();
    return answear;
  }

  /**
   * Destroys the scanner and release the memory
   * @return Boolean
   */
  public static Boolean destroy() {
    scanner.close();
    return true;
  }

  /**
   * Create a scanner to be used system-wide
   * @return Boolean
   */
  private static Boolean init() {
    if(scanner != null)
      return true;

    scanner = new Scanner(System.in);
    return true;
  }
}
