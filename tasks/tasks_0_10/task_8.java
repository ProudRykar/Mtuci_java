package tasks.tasks_0_10;
//Наибольший общий делитель
public class task_8 {
  public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

public static void main(String[] args) {
    System.out.println(gcd(48, 18));  // 6
    System.out.println(gcd(52, 8));   // 4
    System.out.println(gcd(259, 28)); // 1
}
}
