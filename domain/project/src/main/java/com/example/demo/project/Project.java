package com.example.demo.project;

import com.example.demo.todo.ToDo;

import java.util.List;

public record Project(String id, String name, List<ToDo> toDos) {
}
