package de.propra;

import java.time.LocalDate;

public class Habit {
  private final String name;
  private int streak;
  private LocalDate lastCompletedDate; // null if never completed

  public Habit(String name) {
    this.name = name;
    this.streak = 0;
    this.lastCompletedDate = null;
  }

  public String getName() {
    return name;
  }

  public int getStreak() {
    return streak;
  }

  public void completeToday(LocalDate today) {
    if (lastCompletedDate != null && lastCompletedDate.equals(today)) {
      return;
    }

    if (lastCompletedDate != null && lastCompletedDate.plusDays(1).equals(today)) {
      streak++;
    } else {
      streak = 1;
    }

    lastCompletedDate = today;
  }

  @Override
  public String toString() {
    return name + " (Streak: " + streak + ")";
  }
}

