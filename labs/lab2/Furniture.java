package labs.lab2;

abstract class Furniture {
  private String material;
  private String color;
  private double weight;

  // Счетчик объектов
  private static int objectCount = 0;

  // Конструктор по умолчанию
  public Furniture() {
      this("Неизвестен", "Неизвестен", 0.0);
  }

  // Параметризованный конструктор
  public Furniture(String material, String color, double weight) {
      this.material = material;
      this.color = color;
      this.weight = weight;
      objectCount++;
  }

  // Геттеры и сеттеры
  public String getMaterial() {
      return material;
  }

  public void setMaterial(String material) {
      this.material = material;
  }

  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }

  public double getWeight() {
      return weight;
  }

  public void setWeight(double weight) {
      this.weight = weight;
  }

  // Абстрактные методы
  public abstract void assemble();
  public abstract void use();

  // Статический метод для получения количества созданных объектов
  public static int getObjectCount() {
      return objectCount;
  }

  // Метод для вывода информации об объекте
  public void displayInfo() {
      System.out.println("Материал: " + material);
      System.out.println("Цвет: " + color);
      System.out.println("Вес: " + weight);
  }
}