package tasks;

public class JavaTasks_4 {

  public static double I(double U, double E, double R) {
      return (U - E) / R;  // Исправлено: U - E, а не U + E
  }

  public static void main(String[] args) {
      // Данные: сопротивления (Ом) и ЭДС (В)
      double[] Rn = {2, 4, 3, 6};
      double[] En = {12, 0, 9, 0};
      
      // Направления ЭДС: 1 — к узлу, -1 — от узла
      int[] Ke = {1, -1, 1, -1};

      int n = Rn.length;

      // Инициализация массивов для расчётов
      double[] Gn = new double[n];
      double[] EGn = new double[n];
      double[] Jnkj = new double[n];  // Источники тока, но все равны 0 в данном примере

      // Расчёт проводимостей и произведений ЭДС на проводимость
      for (int i = 0; i < n; i++) {
          Gn[i] = 1 / Rn[i];  // Проводимость
          EGn[i] = Ke[i] * En[i] * Gn[i];  // ЭДС с учётом направления
      }

      // Расчёт узлового напряжения (U12)
      double U12 = sum(EGn) / sum(Gn);

      // Направление напряжений (1 — совпадает с током, -1 — против)
      int[] ku = {1, -1, 1, -1};
      double[] Un = new double[n];  // Напряжения в ветвях
      double[] In = new double[n];  // Токи в ветвях

      // Расчёт напряжений и токов в ветвях
      for (int i = 0; i < n; i++) {
          Un[i] = ku[i] * U12;
          In[i] = I(Un[i], En[i], Rn[i]);
      }

      // Вывод результатов
      System.out.println("Rn = \n" + java.util.Arrays.toString(Rn) + " Ом");
      System.out.println("En = \n" + java.util.Arrays.toString(En) + " В");
      System.out.println("Gn = \n" + java.util.Arrays.toString(Gn) + " См");
      System.out.println("U12 = " + U12 + " В");
      System.out.println("Un = \n" + java.util.Arrays.toString(Un) + " В");
      System.out.println("In = \n" + java.util.Arrays.toString(In) + " А");

      // Проверка по первому закону Кирхгофа (сумма токов в узле)
      double kirchhoffSum = 0;
      for (int i = 0; i < n; i++) {
          kirchhoffSum += ku[i] * In[i];
      }

      System.out.println("Проверка по первому закону Кирхгофа:");
      System.out.println("Сумма токов в узле: " + kirchhoffSum);
      System.out.println("Равна ли сумма 0? " + (Math.abs(kirchhoffSum) < 1e-6 ? "Да" : "Нет"));
  }

  // Вспомогательная функция для вычисления суммы массива
  public static double sum(double[] array) {
      double sum = 0;
      for (double value : array) {
          sum += value;
      }
      return sum;
  }
}