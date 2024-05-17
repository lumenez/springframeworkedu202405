package kr.re.kitri.todolist.exception;

import kr.re.kitri.todolist.model.ErrorMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@Slf4j
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
    ErrorMsg msg = new ErrorMsg();

    @ExceptionHandler(value=ArithmeticException.class)
    public ErrorMsg handleArithmaticException(ArithmeticException exception) {
        log.error(exception.getMessage());
        msg.setErrorCode("001");
        msg.setErrorMessage("0 나누기 오류");
        msg.setTechnicalMessage(exception.getMessage());
        return msg;
    }

    @ExceptionHandler(value= SQLException.class)
    public ErrorMsg handleSQLException(SQLException exception) {
        log.error(exception.getMessage());
        msg.setErrorCode("002");
        msg.setErrorMessage("데이터베이스 오류");
        msg.setTechnicalMessage(exception.getMessage());
        return msg;
    }
}
