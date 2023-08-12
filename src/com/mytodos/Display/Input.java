package com.mytodos.Display;

import java.util.Scanner;

public class Input {
  private static Scanner scanner;

  /**
   * Prints out the question from argument and reads answear from user
   * @param question
   * @return String
   */
  public static String askQuestion(String question) {
    System.out.print(question);
    return readAnswear();
  }

  public static String readAnswear() {
    init();
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
