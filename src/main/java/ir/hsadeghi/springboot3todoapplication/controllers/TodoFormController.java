package ir.hsadeghi.springboot3todoapplication.controllers;

import ir.hsadeghi.springboot3todoapplication.services.TodoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TodoFormController {
    private final TodoItemService todoItemService;

    @GetMapping("/create-todo")
    public String showCreateForm() {
        return "new-todo-item";
    }
}
