package ir.hsadeghi.springboot3todoapplication.repositories;

import ir.hsadeghi.springboot3todoapplication.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}
