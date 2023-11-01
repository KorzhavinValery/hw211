package sky.pro.hw211.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ArithmeticException extends IllegalArgumentException {
    public ArithmeticException() {
    }

    public ArithmeticException(String s) {
        super(s);
    }

    public ArithmeticException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArithmeticException(Throwable cause) {
        super(cause);
    }
}
