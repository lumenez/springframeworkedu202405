package kr.re.kitri.todolist.service;

import kr.re.kitri.todolist.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(int todoId);
    void writeTodo(Todo todo);
}
