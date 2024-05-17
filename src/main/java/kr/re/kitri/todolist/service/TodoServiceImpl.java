package kr.re.kitri.todolist.service;

import kr.re.kitri.todolist.model.Todo;
import kr.re.kitri.todolist.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TodoServiceImpl implements TodoService {
    //public static final Logger log = LoggerFactory.getLogger(TodoServiceImpl.class);

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        log.debug("TodoServiceImpl getAllTodos");
        List<Todo> todos = todoRepository.selectAllTodos();
        return todos;
    }

    public Todo getTodoById(int todoId) {
        return todoRepository.selectTodo(todoId);
    }

    public void writeTodo(Todo todo) {
        todoRepository.insertTodo(todo);
    }
}
