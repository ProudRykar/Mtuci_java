package tasks.tasks_0_10;
//Факториал числа
public class task_7 {
  public static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * factorial(n - 1);
}

public static void main(String[] args) {
    System.out.println(factorial(3));  // 6
    System.out.println(factorial(5));  // 120
    System.out.println(factorial(7));  // 5040
}
}
