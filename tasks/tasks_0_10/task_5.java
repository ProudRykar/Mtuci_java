package tasks.tasks_0_10;
//Тернарный оператор для нахождения большего числа
public class task_5 {
  public static int ternaryEvaluation(int a, int b) {
    return a > b ? a : b;
}

public static void main(String[] args) {
    System.out.println(ternaryEvaluation(8, 4));  // 8
    System.out.println(ternaryEvaluation(1, 11)); // 11
    System.out.println(ternaryEvaluation(5, 9));  // 9
}
}
