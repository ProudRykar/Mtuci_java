package labs.lab6;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class SalesTracker {
    private ConcurrentHashMap<String, Integer> sales = new ConcurrentHashMap<>();

    // Добавление товара
    public void addSale(String product, int quantity) {
        sales.merge(product, quantity, Integer::sum);
    }

    // Вывод всех продаж
    public void printSales() {
        System.out.println("Список проданных товаров:");
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Подсчет общей суммы продаж
    public int getTotalSales() {
        return sales.values().stream().mapToInt(Integer::intValue).sum();
    }

    // Поиск самого популярного товара
    public String getMostPopularProduct() {
        return sales.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Нет продаж");
    }

    public static void main(String[] args) {
        SalesTracker tracker = new SalesTracker();

        // Добавляем продажи
        tracker.addSale("Apple", 10);
        tracker.addSale("Banana", 20);
        tracker.addSale("Apple", 5);

        // Печатаем список продаж
        tracker.printSales();

        // Общая сумма продаж
        System.out.println("Общая сумма продаж: " + tracker.getTotalSales());

        // Самый популярный товар
        System.out.println("Самый популярный товар: " + tracker.getMostPopularProduct());
    }
}