package de.propra;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    HabitTracker tracker = new HabitTracker();
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("\nCommands: add, complete, show, exit");
      System.out.print("> ");

      String cmd = sc.next();

      if (cmd.equalsIgnoreCase("add")) {
        System.out.print("Habit name: ");
        String name = sc.next();
        tracker.addHabit(name);

      } else if (cmd.equalsIgnoreCase("complete")) {
        System.out.print("Habit name: ");
        String name = sc.next();
        tracker.completeHabit(name, LocalDate.now());

      } else if (cmd.equalsIgnoreCase("show")) {
        tracker.showHabits();

      } else if (cmd.equalsIgnoreCase("exit")) {
        System.out.println("Goodbye!");
        break;

      } else {
        System.out.println("Invalid command.");
      }
    }

    sc.close();
  }
}
