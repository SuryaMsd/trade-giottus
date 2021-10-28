package trade.giottus;

public class BusinessException extends Exception {

    final String message;
    public BusinessException(String errorMessage) {
        this.message = errorMessage;
    }
}
