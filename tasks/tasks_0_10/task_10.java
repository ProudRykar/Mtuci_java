package tasks.tasks_0_10;
//Подсчет недостающих столов для студентов
public class task_10 {
  public static int tables(int students, int tablesAvailable) {
    int tablesNeeded = (students + 1) / 2;  // Каждая пара студентов занимает один стол
    return Math.max(0, tablesNeeded - tablesAvailable);
}

public static void main(String[] args) {
    System.out.println(tables(5, 2));  // 1
    System.out.println(tables(31, 20)); // 0
    System.out.println(tables(123, 58)); // 4
}
}
