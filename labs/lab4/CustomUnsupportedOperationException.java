package labs.lab4;

public class CustomUnsupportedOperationException extends UnsupportedOperationException {
  private final String message;
  
  public CustomUnsupportedOperationException(String message) {
      super(message);
      this.message = message;
  }
  
  @Override
  public String getMessage() {
      return "Неподдерживаемая операция: " + message;
  }
}
