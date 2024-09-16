package tasks.tasks_0_10;
public class task_1 {
    public static double convert(int gallons) {
        return gallons * 3.785;
    }

    public static void main(String[] args) {
        System.out.println(convert(5));  // 18.925
        System.out.println(convert(3));  // 11.355
        System.out.println(convert(8));  // 30.28
    }
}
