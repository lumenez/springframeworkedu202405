package kr.re.kitri.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    private long todoId;
    private String content;
    private boolean completed;
}
