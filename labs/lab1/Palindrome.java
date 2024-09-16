package labs.lab1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      System.out.print("Введите слово: ");
      String input = scanner.nextLine();
      String input_changed = input.replaceAll("\\s+", "").toLowerCase();
      
      if (isPalindrome(input_changed)) {
          System.out.println(input + " является палиндромом");
      } else {
          System.out.println(input + " не является палиндромом");
      }
      
      scanner.close(); 
    }

  public static String reverseString(String s) {
    String reversed = "";
    for (int i = s.length() - 1; i >= 0; i--) {
        reversed += s.charAt(i);
    }
    return reversed;
  }

  public static boolean isPalindrome(String s) {
    return s.equals(reverseString(s));
  }
}
