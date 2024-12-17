package labs.lab6;
import java.util.EmptyStackException;

public class Stack<T> {
  private T[] data;
  private int size;

  @SuppressWarnings("unchecked")
  public Stack(int capacity) {
      data = (T[]) new Object[capacity]; // Без аннотации @SuppressWarnings("unchecked") из-за особенностей языка Java тот предупреждает о небезопасности приведения Object
      size = 0;
  }

  // Добавление элемента в стек
  public void push(T element) {
      if (size == data.length) {
          throw new StackOverflowError("Стек переполнен");
      }
      data[size++] = element;
  }

  // Удаление верхнего элемента из стека
  public T pop() {
      if (size == 0) {
          throw new EmptyStackException();
      }
      T element = data[--size];
      data[size] = null; // Очищаем ссылку
      return element;
  }

  // Получение верхнего элемента стека без удаления
  public T peek() {
      if (size == 0) {
          throw new EmptyStackException();
      }
      return data[size - 1];
  }

  // Проверка, пуст ли стек
  public boolean isEmpty() {
      return size == 0;
  }
}