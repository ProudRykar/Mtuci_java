package tasks.tasks_0_10;
//Подсчет выручки от продажи билетов
public class task_9 {
  public static int ticketSaler(int ticketsSold, int ticketPrice) {
    double commissionRate = 0.08;  // Комиссия 8%
    int totalRevenue = (int)(ticketsSold * ticketPrice * (1 - commissionRate));
    return totalRevenue;
}

public static void main(String[] args) {
    System.out.println(ticketSaler(70, 1500));  // 75600
    System.out.println(ticketSaler(24, 950));   // 16416
    System.out.println(ticketSaler(53, 1250));  // 47700
}
}
