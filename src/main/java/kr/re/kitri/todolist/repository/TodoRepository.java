package kr.re.kitri.todolist.repository;

import kr.re.kitri.todolist.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TodoRepository {
    List<Todo> selectAllTodos();
    Todo selectTodo(int todoId);
    void insertTodo(Todo todo);
}
