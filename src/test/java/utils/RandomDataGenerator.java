package utils;

import java.util.Random;

public class RandomDataGenerator {
  public static String randomGender() {
    String[] gender = new String[]{"Male", "Female", "Other"};
    Random random = new Random();
    String randomGender = gender[random.nextInt(gender.length)];
    return randomGender;
  }

  public static String randomMonth() {
    String[] month = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    Random random = new Random();
    String randomMonths = month[random.nextInt(month.length)];
    return randomMonths;
  }

  public static String randomSubjects() {
    String[] subjects = {"Maths", "Economics", "English", "Biology", "Physics",
            "Chemistry", "Computer Science", "Accounting", "History"};
    Random random = new Random();
    String randomSubjects = subjects[random.nextInt(subjects.length)];
    return randomSubjects;
  }

  public static String randomHobbies() {
    String[] hobbies = {"Sports", "Reading", "Music"};
    Random random = new Random();
    String randomHobbies = hobbies[random.nextInt(hobbies.length)];
    return randomHobbies;
  }
}