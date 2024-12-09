package labs.lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            
            int[] arr = new int[size];
            
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            
            double average = (double) sum / arr.length;
            System.out.println("Среднее арифметическое элементов массива: " + average);
            
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: пожалуйста, введите целое число.");
        } finally {
            scanner.close();
        }
    }
}
