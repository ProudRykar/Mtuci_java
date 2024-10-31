package labs.lab2;

class Table extends Furniture {
  private int numberOfLegs;
  private boolean hasDrawers;

  // Конструктор по умолчанию
  public Table() {
      this("Деревянный", "Коричневый", 15.0, 4, false);
  }

  // Параметризованный конструктор
  public Table(String material, String color, double weight, int numberOfLegs, boolean hasDrawers) {
      super(material, color, weight);
      this.numberOfLegs = numberOfLegs;
      this.hasDrawers = hasDrawers;
  }

  // Геттеры и сеттеры
  public int getNumberOfLegs() {
      return numberOfLegs;
  }

  public void setNumberOfLegs(int numberOfLegs) {
      this.numberOfLegs = numberOfLegs;
  }

  public boolean isHasDrawers() {
      return hasDrawers;
  }

  public void setHasDrawers(boolean hasDrawers) {
      this.hasDrawers = hasDrawers;
  }

  // Переопределение методов
  @Override
  public void assemble() {
      System.out.println("Собирать кровать с " + numberOfLegs + " ножками.");
  }

  @Override
  public void use() {
      System.out.println("Использовать стол для трапезы.");
  }

  // Перегрузка displayInfo()
  public void displayInfo(boolean showDetails) {
      super.displayInfo();
      if (showDetails) {
          System.out.println("Количество ног: " + numberOfLegs);
          System.out.println("Количество ящиков: " + hasDrawers);
      }
  }
}