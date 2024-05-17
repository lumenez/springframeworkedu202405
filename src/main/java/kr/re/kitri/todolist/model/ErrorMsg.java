package kr.re.kitri.todolist.model;

import lombok.Data;

@Data
public class ErrorMsg {
    private String errorCode;
    private String errorMessage;
    private String technicalMessage;
}
