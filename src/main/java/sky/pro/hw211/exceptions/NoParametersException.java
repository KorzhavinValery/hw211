package sky.pro.hw211.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class NoParametersException extends RuntimeException {

    public NoParametersException(String message) {
        super(message);
    }
}
