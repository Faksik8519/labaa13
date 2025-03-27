package org.example;

public class App {
  public static void main(String[] args) {
      String name = "Yaroslav";
      System.out.println("Hello, " + name);

    Tester tester1 = new Tester("Yaroslav", "Ladutko", 5, "B2", 9000);
    Tester tester2 = new Tester("Zahar", "Kulchik", 2, "A1");
    Tester tester3 = new Tester("Egor", "Telegin");

    tester1.displayInfo();
    tester2.displayInfo("short");
    tester3.displayInfo(2);

    String info = Tester.getTesterInfo(tester1);
    System.out.println("Статическая информация о тестере: " + info);

  }
}
