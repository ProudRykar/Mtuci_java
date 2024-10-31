package labs.lab2;

class Bed extends Furniture {
  private String size;
  private boolean hasHeadboard;

  // Конструктор по умолчанию
  public Bed() {
      this("Металлическая", "Белая", 25.0, "Средняя", true);
  }

  // Параметризованный конструктор
  public Bed(String material, String color, double weight, String size, boolean hasHeadboard) {
      super(material, color, weight);
      this.size = size;
      this.hasHeadboard = hasHeadboard;
  }

  // Геттеры и сеттеры
  public String getSize() {
      return size;
  }

  public void setSize(String size) {
      this.size = size;
  }

  public boolean isHasHeadboard() {
      return hasHeadboard;
  }

  public void setHasHeadboard(boolean hasHeadboard) {
      this.hasHeadboard = hasHeadboard;
  }

  // Переопределение методов
  @Override
  public void assemble() {
      System.out.println("Собирать кровать.");
  }

  @Override
  public void use() {
      System.out.println("Спать на кровати.");
  }
}
