package com.example.demo.controller;

import com.example.demo.todo.ToDo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("batch/todos")
class BatchController {

    @GetMapping
    public List<ToDo> list() {
        return List.of(
                new ToDo(
                        "1",
                        "バッチです"
                )
        );
    }
}
