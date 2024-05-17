package kr.re.kitri.todolist.controller;

import kr.re.kitri.todolist.model.Todo;
import kr.re.kitri.todolist.service.TodoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class TodoController {
    //public static final Logger log = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoServiceImpl todoService;

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/todos/{todoId}")
    public Todo getTodoById(@PathVariable int todoId) {
        return todoService.getTodoById(todoId);
    }

    @PostMapping("/todos")
    public void writeTodo(@RequestBody Todo todo) {
        todoService.writeTodo(todo);
    }
}
