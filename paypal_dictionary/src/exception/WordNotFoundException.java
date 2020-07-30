package exception;

public class WordNotFoundException extends RuntimeException {
  private String errorMessage;

  public String getErrorMessage() {
    return errorMessage;
  }

  public WordNotFoundException(String errorMessage) {
    super(errorMessage);
    this.errorMessage = errorMessage;
  }
}
