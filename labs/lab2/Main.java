package labs.lab2;

public class Main {
  public static void main(String[] args) {
      // Создание объектов разных типов
      Table table = new Table("Деревянный", "Коричневый", 20.0, 4, true);
      Chair chair = new Chair("Пластиковый", "Красный", 4.5, true, false);
      Bed bed = new Bed("Металлическая", "Белый", 30.0, "Большая", true);

      // Ввод/вывод информации об объектах
      System.out.println("Информация о столе:");
      table.displayInfo(true);
      table.assemble();
      table.use();

      System.out.println("\nИнформация о стуле:");
      chair.displayInfo();
      chair.assemble();
      chair.use();

      System.out.println("\nИнформация о кровати:");
      bed.displayInfo();
      bed.assemble();
      bed.use();

      // Вывод количества созданных объектов
      System.out.println("\nОбщее количество созданной мебели: " + Furniture.getObjectCount());
  }
}
