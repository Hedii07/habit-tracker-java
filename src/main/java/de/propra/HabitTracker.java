package de.propra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HabitTracker {

  private final List<Habit> habits = new ArrayList<>();

  public void addHabit(String name) {
    habits.add(new Habit(name));
    System.out.println("Habit added: " + name);
  }

  public void completeHabit(String name, LocalDate today) {
    for (Habit h : habits) {
      if (h.getName().equalsIgnoreCase(name)) {
        h.completeToday(today);
        System.out.println("Completed: " + name);
        return;
      }
    }
    System.out.println("Habit not found.");
  }

  public void showHabits() {
    if (habits.isEmpty()) {
      System.out.println("No habits yet.");
      return;
    }

    for (Habit h : habits) {
      System.out.println(h);
    }
  }
}

