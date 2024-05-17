package kr.re.kitri.todolist.service;

import kr.re.kitri.todolist.model.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class TodoServicesimplTests {
    private Todo todo;
    @Autowired
    private TodoServiceImpl todoService;

    @Test
    public void testGetAllTodos() {
        List<Todo> allTodos = todoService.getAllTodos();
        Assertions.assertFalse(allTodos.isEmpty());
    }

    @Test
    public void testGetTodoById() {
        Todo testTodo = new Todo(0,"테스트컨텐츠",true);
        todo = todoService.getTodoById(0);

        Assertions.assertEquals(todo, testTodo);
    }

    @Test
    @Transactional
    public void testWriteTodo() {
        todo = new Todo(1111, "qwer1111", false);
        todoService.writeTodo(todo);
    }
}
