package labs.lab6;
import java.util.EmptyStackException;

public class Stack<T> {
  private T[] data;
  private int size;

  @SuppressWarnings("unchecked")
  public Stack(int capacity) {
      data = (T[]) new Object[capacity];
      size = 0;
  }

  public void push(T element) {
      if (size == data.length) {
          throw new StackOverflowError("Стек переполнен");
      }
      data[size++] = element;
  }
  public T pop() {
      if (size == 0) {
          throw new EmptyStackException();
      }
      T element = data[--size];
      data[size] = null; // Очищаем ссылку
      return element;
  }

  public T peek() {
      if (size == 0) {
          throw new EmptyStackException();
      }
      return data[size - 1];
  }

  public boolean isEmpty() {
      return size == 0;
  }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Вывод: 3
        System.out.println(stack.peek()); // Вывод: 2
        stack.push(4);
        System.out.println(stack.pop()); // Вывод: 4
    }
}


