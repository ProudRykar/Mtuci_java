package labs.lab2;

class Chair extends Furniture {
  private boolean hasArmrest;
  private boolean isSwivel;

  // Конструктор по умолчанию
  public Chair() {
      this("Пластиковый", "Чёрный", 5.0, false, false);
  }

  // Параметризованный конструктор
  public Chair(String material, String color, double weight, boolean hasArmrest, boolean isSwivel) {
      super(material, color, weight);
      this.hasArmrest = hasArmrest;
      this.isSwivel = isSwivel;
  }

  // Геттеры и сеттеры
  public boolean isHasArmrest() {
      return hasArmrest;
  }

  public void setHasArmrest(boolean hasArmrest) {
      this.hasArmrest = hasArmrest;
  }

  public boolean isSwivel() {
      return isSwivel;
  }

  public void setSwivel(boolean isSwivel) {
      this.isSwivel = isSwivel;
  }

  // Переопределение методов
  @Override
  public void assemble() {
      System.out.println("Собирать стул.");
  }

  @Override
  public void use() {
      System.out.println("Сидеть на стуле.");
  }
}
