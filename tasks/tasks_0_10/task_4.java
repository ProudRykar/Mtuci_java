package tasks.tasks_0_10;
//Определение типа треугольника
public class task_4 {
  public static String triangleType(int x, int y, int z) {
    if (x + y <= z || x + z <= y || y + z <= x) {
        return "Не треугольник";
    } else if (x == y && y == z) {
        return "Равносторонний";
    } else if (x == y || y == z || x == z) {
        return "Равнобедренный";
    } else {
        return "Разносторонний";
    }
}

public static void main(String[] args) {
    System.out.println(triangleType(5, 5, 5));  
    System.out.println(triangleType(5, 4, 5));  
    System.out.println(triangleType(3, 4, 5));  
    System.out.println(triangleType(5, 1, 1)); 
}
}
