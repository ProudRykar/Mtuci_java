package tasks.tasks_0_10;
//Подсчет количества пододеяльников
public class task_6 {
  public static int howManyItems(double n, double w, double h) {
    double availableFabric = n * 2;
    double oneItemFabric = w * h;
    return (int)(availableFabric / oneItemFabric);
}

public static void main(String[] args) {
    System.out.println(howManyItems(22, 1.4, 2));  // 3
    System.out.println(howManyItems(45, 1.8, 1.9));  // 6
    System.out.println(howManyItems(100, 2, 2));  // 12
}
}
